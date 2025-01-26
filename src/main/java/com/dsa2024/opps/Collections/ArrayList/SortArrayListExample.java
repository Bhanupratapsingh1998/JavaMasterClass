package com.dsa2024.opps.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Sort the ArrayList
        Collections.sort(list);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
