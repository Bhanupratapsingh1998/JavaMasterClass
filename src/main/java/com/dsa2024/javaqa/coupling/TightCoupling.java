package com.dsa2024.javaqa.coupling;

// Tight coupling example
class PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing generic payment of $" + amount);
    }

    public void payPalPaymentProcessor(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

class OrderProcessor {
    private PaymentProcessor paymentProcessor = new PaymentProcessor(); // Hardcoded dependency

    public void processOrder(double orderAmount) {
        System.out.println("Order is being processed...");
        paymentProcessor.processPayment(orderAmount); // Direct dependency
        paymentProcessor.payPalPaymentProcessor(orderAmount); // Direct dependency
    }
}

public class TightCoupling {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor(); // No flexibility to inject dependencies
        orderProcessor.processOrder(100.0); // Hardcoded logic for processing order
    }
}
