package com.dsa2024.opps.ExceptionExceptions;

public class customException {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        try {
            cart.purchaseItem("laptop", 3); // Successful purchase
            cart.purchaseItem("headphones", 1); // This will throw OutOfStockException
        } catch (OutOfStockException e) {
            // Handle out of stock scenario, e.g., notify user
            System.err.println(e.getMessage());

            // Use the custom fields for more detailed handling or logging
            System.err.println("Item: " + e.getItemName());
            System.err.println("Available Quantity: " + e.getAvailableQuantity());
            System.err.println("Requested Quantity: " + e.getRequestedQuantity());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
