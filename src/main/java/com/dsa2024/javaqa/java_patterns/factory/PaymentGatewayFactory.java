package com.dsa2024.javaqa.java_patterns.factory;

//Factory
public class PaymentGatewayFactory {

    public static PaymentGateway getGateway(String type) {
        if ("RAZORPAY".equalsIgnoreCase(type)) {
            return new RazorpayGateway();
        }
        if ("PAYPAL".equalsIgnoreCase(type)) {
            return new PaypalGateway();
        }
        throw new IllegalArgumentException("Invalid Payment Type");
    }

    public static void main(String[] args) {
        PaymentGateway gateway = PaymentGatewayFactory.getGateway("RAZORPAY");
        gateway.processPayment(2500);
    }
}
