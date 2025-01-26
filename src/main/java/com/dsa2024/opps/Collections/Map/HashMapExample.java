package com.dsa2024.opps.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add some initial values
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Create a thread that increments the value for key "A"
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put("A", map.get("A") + 1);
            }
        });

        // Create another thread that increments the value for key "B"
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put("B", map.get("B") + 1);
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
