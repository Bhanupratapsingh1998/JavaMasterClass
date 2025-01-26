package com.dsa2024.opps.Collections.Map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Add some initial values
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Create a thread that increments the value for key "A"
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.computeIfPresent("A", (key, val) -> val + 1);
            }
        });

        // Create another thread that increments the value for key "B"
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.computeIfPresent("B", (key, val) -> val + 1);
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to complete
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final values
        System.out.println("Final value for key A: " + map.get("A"));
        System.out.println("Final value for key B: " + map.get("B"));
        System.out.println("Final value for key C: " + map.get("C"));
    }
}
