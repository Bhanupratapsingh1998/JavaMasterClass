package com.dsa2024.javaqa.java_patterns.observer;

import java.util.*;

//Observer
public class OrderService {

    private List<OrderObserver> observers = new ArrayList<>();

    public void registerObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void updateOrderStatus(String orderId, String status) {
        for (OrderObserver obs : observers) {
            obs.update(orderId, status);
        }
    }

    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.registerObserver(new EmailService());
        orderService.registerObserver(new SmsService());
        orderService.updateOrderStatus("ORD123", "DELIVERED");

    }
}
