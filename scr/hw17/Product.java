package hw17;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Product {
    String type;
    double price;
    boolean discount;
    LocalDateTime date;

    public Product() {
        type = "Food";
        price = 100;
        discount = false;
        date = LocalDateTime.now();
    }

    public Product(String type, double price, boolean discount, LocalDateTime date) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.date = date;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setDate(LocalDateTime date) { // 4.1
        this.date = date;
    }

    public LocalDateTime getDate() { // 4.1
        return date;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public boolean hasDiscount() {
        return discount;
    }

    public void print() {
       // System.out.println(type + ", " + price + "$");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(type + ", " + price + "$, date add: " + date.format(formatter));
    }
}
