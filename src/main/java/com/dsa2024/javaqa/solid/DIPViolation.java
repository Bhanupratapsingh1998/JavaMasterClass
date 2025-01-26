package com.dsa2024.javaqa.solid;

public class DIPViolation {

    // Low-level module
    static class CreditCardPayment {
        public void pay(double amount) {
            System.out.println("Paid $" + amount + " using Credit Card");
        }
    }

    // High-level module (directly depends on low-level module)
    static class OrderProcessor {
        private final CreditCardPayment payment;

        public OrderProcessor() {
            this.payment = new CreditCardPayment(); // Hard-coded dependency
        }

        public void processOrder(double amount) {
            System.out.println("Processing order...");
            payment.pay(amount); // Directly depends on CreditCardPayment
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Violation of DIP ===");
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder(100.0);
    }
}

