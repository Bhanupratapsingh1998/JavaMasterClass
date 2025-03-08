package com.dsa2024.javaqa.collections;

import java.util.ArrayList;
import java.util.List;

public class SetListExample {
    public static void main(String[] args) {
        // Create a List and add some elements
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        System.out.println("Original List: " + fruits);

        // Replace the element at index 1
        String oldFruit = fruits.set(1, "Blueberry");

        System.out.println("Updated List: " + fruits);
        System.out.println("Replaced Element: " + oldFruit);
    }
}
