package com.dsa2024.opps.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayListExample {
    public static void main(String[] args) {
        // Create an array
        String[] array = { "Apple", "Banana", "Cherry" };

        // Convert Array to ArrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));

        // Print the ArrayList
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
