package com.dsa2024.javaqa.java_patterns.factory;

public class RazorpayGateway implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing via Razorpay: " + amount);
    }
}
