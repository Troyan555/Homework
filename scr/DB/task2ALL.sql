use classicmodels;
select e.firstName, e.lastName, o.city from employees e, offices o
where o.city in ('Paris','Tokyo');

select e.FirstName, e.LastName, count(c.contactFirstName) customers from employees e
left join customers c on e.employeeNumber=c.salesRepEmployeeNumber
group by e.FirstName, e.LastName
order by e.FirstName asc;

SELECT e2.firstName as Manager_FN, e2.lastName as Manager_LN, e1.firstName, e1.lastName FROM employees e1
left join employees e2 on e2.employeeNumber = e1.reportsTo
where e1.reportsTo = 1102;

select e.FirstName, e.LastName, count(c.contactFirstName) customers from employees e
left join customers c on e.employeeNumber=c.salesRepEmployeeNumber
group by e.FirstName, e.LastName
having customers <5
order by customers desc;

select e.employeeNumber, e.firstName, e.lastName, o.shippedDate from employees e
left join customers c on e.employeeNumber=c.salesRepEmployeeNumber
left join orders o on c.customerNumber=o.customerNumber
where shippedDate is null
order by e.FirstName asc;

select e.firstName, e.lastName, COUNT(distinct o.orderNumber) AS orderscount
from employees e
left join customers c on e.employeeNumber=c.salesRepEmployeeNumber
left join orders o on c.customerNumber=o.customerNumber
group by e.firstName,e.lastName
order by orderscount desc;

select e.firstName, e.lastName, COUNT(distinct o.orderNumber) AS orderscount
from employees e 
left join customers c on e.employeeNumber=c.salesRepEmployeeNumber
left join orders o on c.customerNumber=o.customerNumber
group by e.firstName,e.lastName
HAVING
      count(o.orderNumber) <= ALL #Worst
           (SELECT count(o.orderNumber)
           from employees e 
           left join customers c on e.employeeNumber=c.salesRepEmployeeNumber
           left join orders o on c.customerNumber=o.customerNumber
           group by e.firstName,e.lastName);

select e.firstName, e.lastName, COUNT(distinct o.orderNumber) AS orderscount
from employees e 
left join customers c on e.employeeNumber=c.salesRepEmployeeNumber
left join orders o on c.customerNumber=o.customerNumber
group by e.firstName,e.lastName
HAVING
      count(o.orderNumber) >= ALL #Best
           (SELECT count(o.orderNumber)
           from employees e 
           left join customers c on e.employeeNumber=c.salesRepEmployeeNumber
           left join orders o on c.customerNumber=o.customerNumber
           group by e.firstName,e.lastName);
