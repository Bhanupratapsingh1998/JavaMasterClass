package com.dsa2024.opps.Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListToArrayExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Convert ArrayList to Array
        String[] array = new String[list.size()];
        array = list.toArray(array);

        // Print the array
        for (String fruit : array) {
            System.out.println(fruit);
        }
    }
}
