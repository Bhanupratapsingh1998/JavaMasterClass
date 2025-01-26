package com.dsa2024.javaqa.relation;

class ProductManager {
    private String name;
    private double price;

    public ProductManager(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showProductDetails() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }

    public double calculateTotalPrice(int quantity) {
        return price * quantity;
    }

    public void applyDiscount(double discount) {
        price -= discount;
        System.out.println("Discount applied. New Price: " + price);
    }
}

// A single class handles unrelated responsibilities.
public class LowCohesion {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager("Laptop", 1000.00);

        productManager.showProductDetails();
        double total = productManager.calculateTotalPrice(2);
        System.out.println("Total Price for 2 items: " + total);
        productManager.applyDiscount(50.00);
    }
}
