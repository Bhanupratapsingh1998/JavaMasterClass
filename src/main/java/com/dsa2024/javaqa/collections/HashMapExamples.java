package com.dsa2024.javaqa.collections;

import java.util.*;

public class HashMapExamples {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Basic
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        System.out.println("Initial Map: " + map);

        // Access
        System.out.println("Get A: " + map.get("A"));

        // Check
        System.out.println("Contains key B? " + map.containsKey("B"));
        System.out.println("Contains value 30? " + map.containsValue(30));

        // Advanced
        map.putIfAbsent("D", 40);
        map.replace("A", 100);
        map.compute("B", (k, v) -> v + 5);
        map.computeIfAbsent("E", k -> 50);
        map.computeIfPresent("C", (k, v) -> v * 2);
        map.merge("D", 10, (oldV, newV) -> oldV + newV);
        System.out.println("After Advanced Ops: " + map);

        // View
        for (String key : map.keySet())
            System.out.println("Key: " + key);
        for (Integer value : map.values())
            System.out.println("Value: " + value);
        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " => " + entry.getValue());

        // Final cleanup
        System.out.println("Size: " + map.size());
        map.clear();
        System.out.println("Is map empty? " + map.isEmpty());
    }
}
