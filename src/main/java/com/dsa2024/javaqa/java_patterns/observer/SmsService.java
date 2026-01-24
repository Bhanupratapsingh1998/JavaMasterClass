package com.dsa2024.javaqa.java_patterns.observer;

public class SmsService implements OrderObserver {
    public void update(String orderId, String status) {
        System.out.println("SMS sent for " + orderId);
    }
}
