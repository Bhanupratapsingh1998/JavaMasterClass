package com.dsa2024.javaqa.collections;

import java.util.ArrayList;
import java.util.List;

public class RetainAllExample {
    public static void main(String[] args) {
        /*The retainAll() method is commonly used for finding the intersection of two collections.*/
        // Create two lists
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Date");

        List<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Date");
        list2.add("Elderberry");

        System.out.println("List 1 before retainAll: " + list1);
        System.out.println("List 2: " + list2);

        // Retain only the elements in list1 that are present in list2
        boolean isModified = list1.retainAll(list2);

        System.out.println("List 1 after retainAll: " + list1);
        System.out.println("Was List 1 modified? " + isModified);
    }
}

