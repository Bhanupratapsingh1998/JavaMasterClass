package com.dsa2024.opps.Collections.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreationExample {
    public static void main(String[] args) {
        // 1. Using the LinkedList Class
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        System.out.println("1. Using the LinkedList Class: " + list1);

        // 2. Using addFirst and addLast Methods
        LinkedList<String> list2 = new LinkedList<>();
        list2.addFirst("Cherry");
        list2.addFirst("Banana");
        list2.addFirst("Apple");
        list2.addLast("Date");
        list2.addLast("Fig");
        System.out.println("2. Using addFirst and addLast Methods: " + list2);

        // 3. Using the Arrays.asList Method
        LinkedList<String> list3 = new LinkedList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println("3. Using the Arrays.asList Method: " + list3);

        // 4. Using the List.of Method (Java 9+)
        List<String> immutableList = List.of("Apple", "Banana", "Cherry");
        LinkedList<String> list4 = new LinkedList<>(immutableList);
        System.out.println("4. Using the List.of Method (Java 9+): " + list4);
    }
}
