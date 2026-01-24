package com.dsa2024.javaqa.java_patterns.observer;

public class EmailService implements OrderObserver {
    public void update(String orderId, String status) {
        System.out.println("Email sent for " + orderId);
    }
}


