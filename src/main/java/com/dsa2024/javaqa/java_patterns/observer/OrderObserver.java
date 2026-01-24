package com.dsa2024.javaqa.java_patterns.observer;

public interface OrderObserver {
    void update(String orderId, String status);
}

