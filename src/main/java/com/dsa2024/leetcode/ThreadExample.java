package com.dsa2024.leetcode;

public class ThreadExample {
    public static void main(String[] args) {
        Object kitchenLock = new Object();
        boolean[] isDishReady = { false }; // Shared flag to track dish readiness

        // Chef thread: Prepares the dish and notifies the waiter.
        Thread chef = new Thread(() -> {
            synchronized (kitchenLock) {
                System.out.println("Chef: Preparing the dish...");
                try {
                    Thread.sleep(3000); // Simulate time to prepare the dish
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                isDishReady[0] = true; // Set dish readiness flag
                System.out.println("Chef: Dish is ready! Notifying the waiter...");
                kitchenLock.notify(); // Notify the waiter
            }
        });

        // Waiter thread: Waits for the dish and serves it.
        Thread waiter = new Thread(() -> {
            synchronized (kitchenLock) {
                while (!isDishReady[0]) { // Check dish readiness before waiting
                    System.out.println("Waiter: Waiting for the chef to prepare the dish...");
                    try {
                        kitchenLock.wait(); // Wait until notified
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Waiter: Dish received! Serving the customer...");
            }
        });

        // Start both threads
        waiter.start(); // Start waiter first to ensure it waits
        chef.start();

        // Main thread waits for chef and waiter to finish their tasks
        try {
            chef.join(); // Ensure chef finishes
            waiter.join(); // Ensure waiter finishes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread: All tasks are completed!");
    }
}
