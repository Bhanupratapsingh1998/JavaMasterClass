package com.dsa2024.opps.ExceptionExceptions;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Integer> stock;

    public ShoppingCart() {
        stock = new HashMap<>();
        stock.put("laptop", 5);
        stock.put("smartphone", 10);
        stock.put("headphones", 0); // Out of stock
    }

    public void purchaseItem(String itemName, int requestedQuantity) throws OutOfStockException {
        if (!stock.containsKey(itemName)) {
            throw new IllegalArgumentException("Item '" + itemName + "' not found in stock.");
        }

        int availableQuantity = stock.get(itemName);
        if (requestedQuantity > availableQuantity) {
            throw new OutOfStockException(itemName, availableQuantity, requestedQuantity);
        }

        // Process purchase
        stock.put(itemName, availableQuantity - requestedQuantity);
        System.out.println("Purchased " + requestedQuantity + " of " + itemName);
    }
}
