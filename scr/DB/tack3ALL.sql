# Add a new Customer who is supported by manager "Jennings Leslie". 1165
-- Also, add an order for him with a product - '1996 Moto Guzzi 1100i' -- productName S10_2016

INSERT INTO customers(customerNumber, customerName,contactLastName,contactFirstName,phone,addressLine1,city,country, salesRepEmployeeNumber)
VALUES ((select MAX(c.customerNumber)+1 from customers c), 'Irina LLC','Troian', 'Irina','2823324','777 strt','Odessa','Ukraine',
(SELECT employeeNumber FROM employees WHERE lastName = 'Jennings' AND firstName = 'Leslie' )
);
INSERT INTO orders (orderNumber, orderDate, requiredDate,shippedDate,status,customerNumber)
VALUES ((select MAX(o.orderNumber)+1 from orders o), curdate(),curdate()+INTERVAL 10 DAY,curdate()+INTERVAL 10 DAY,'Shipped', 
        (SELECT customerNumber FROM customers WHERE customerName = 'Irina LLC'));
INSERT INTO orderdetails (orderNumber, productCode, quantityOrdered, priceEach, orderLineNumber)
VALUES (
       (SELECT orderNumber FROM orders WHERE customerNumber = 
              (SELECT customerNumber FROM customers WHERE customerName = 'Irina LLC')),
	   (SELECT  productCode FROM products WHERE productName = '1996 Moto Guzzi 1100i') , 
       12, 333, 12);


# Update customerName = customerName +' Superstar' for customers that did more than 10 orders

UPDATE customers c 
	SET c.customerName = CONCAT(c.customerName, ' Superstar')
WHERE c.customerName IN 
           (SELECT s.customerName 
                  FROM (SELECT c.customerName, COUNT(*) as orders_amount FROM customers c
                        LEFT JOIN orders o ON c.customerNumber = o.customerNumber
                              GROUP BY c.customerNumber HAVING orders_amount > 10) as s)
LIMIT 1000; 


# Delete customer "Diecast Collectables" and related data

DELETE FROM orderdetails
WHERE orderNumber IN (SELECT orderNumber FROM orders
WHERE customerNumber = (select customerNumber FROM customers
WHERE customerName = 'Diecast Collectables'));

DELETE FROM orders
WHERE customerNumber = (select customerNumber FROM customers
WHERE customerName = 'Diecast Collectables');

DELETE FROM payments
WHERE customerNumber = (select customerNumber FROM customers
WHERE customerName = 'Diecast Collectables');

DELETE FROM customers
WHERE customerName = 'Diecast Collectables';