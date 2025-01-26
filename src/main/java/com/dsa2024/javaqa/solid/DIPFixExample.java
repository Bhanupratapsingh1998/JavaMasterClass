package com.dsa2024.javaqa.solid;

public class DIPFixExample {

    // Abstraction
    interface PaymentMethod {
        void pay(double amount);
    }

    // Low-level module: Credit Card Payment
    static class CreditCardPayment implements PaymentMethod {
        @Override
        public void pay(double amount) {
            System.out.println("Paid $" + amount + " using Credit Card");
        }
    }

    // Low-level module: PayPal Payment
    static class PayPalPayment implements PaymentMethod {
        @Override
        public void pay(double amount) {
            System.out.println("Paid $" + amount + " using PayPal");
        }
    }

    // High-level module (depends on abstraction, not implementation)
    static class OrderProcessor {
        private final PaymentMethod paymentMethod;

        public OrderProcessor(PaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod; // Inject dependency via constructor
        }

        public void processOrder(double amount) {
            System.out.println("Processing order...");
            paymentMethod.pay(amount); // Uses abstraction
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Fixing DIP ===");

        // Use CreditCardPayment
        OrderProcessor creditCardOrderProcessor = new OrderProcessor(new CreditCardPayment());
        creditCardOrderProcessor.processOrder(100.0);

        // Use PayPalPayment
        OrderProcessor paypalOrderProcessor = new OrderProcessor(new PayPalPayment());
        paypalOrderProcessor.processOrder(200.0);
    }
}

