package com.dsa2024.javaqa.coupling;

// PaymentProcessor interface
interface PaymentProcessor1 {
    void processPayment(double amount);
}

// Credit Card Payment implementation
class CreditCardPaymentProcessor implements PaymentProcessor1 {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

// PayPal Payment implementation
class PayPalPaymentProcessor implements PaymentProcessor1 {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

// OrderProcessor class depends on the PaymentProcessor interface
class OrderProcessor1 {
    private PaymentProcessor1 paymentProcessor;

    // Dependency Injection via constructor
    public OrderProcessor1(PaymentProcessor1 paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processOrder(double orderAmount) {
        System.out.println("Order is being processed...");
        paymentProcessor.processPayment(orderAmount); // No hardcoded dependency
    }
}

public class LooseCoupling {
    public static void main(String[] args) {
        // Using Credit Card Payment
        PaymentProcessor1 creditCardProcessor = new CreditCardPaymentProcessor();
        OrderProcessor1 orderWithCreditCard = new OrderProcessor1(creditCardProcessor);
        orderWithCreditCard.processOrder(150.0);

        // Using PayPal Payment
        PaymentProcessor1 paypalProcessor = new PayPalPaymentProcessor();
        OrderProcessor1 orderWithPayPal = new OrderProcessor1(paypalProcessor);
        orderWithPayPal.processOrder(200.0);
    }
}
