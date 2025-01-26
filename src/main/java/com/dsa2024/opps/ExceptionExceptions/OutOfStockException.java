package com.dsa2024.opps.ExceptionExceptions;

/* Custom Exception Class */
public class OutOfStockException extends Exception {
    private String itemName;
    private int availableQuantity;
    private int requestedQuantity;

    public OutOfStockException(String itemName, int availableQuantity, int requestedQuantity) {
        super(String.format("Item '%s' is out of stock. Available: %d, Requested: %d", itemName, availableQuantity,
                requestedQuantity));
        this.itemName = itemName;
        this.availableQuantity = availableQuantity;
        this.requestedQuantity = requestedQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public int getRequestedQuantity() {
        return requestedQuantity;
    }
}
