package com.dsa2024.opps.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubListExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> originalList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Obtaining a sublist
        List<Integer> sublist = new ArrayList<>(originalList.subList(1, 4)); // sublist = [2, 3, 4]

        // Modifying the original list
        originalList.add(6); // Now originalList = [1, 2, 3, 4, 5, 6]

        // Modifying the sublist
        sublist.set(0, 10); // Now sublist = [10, 3, 4]

        // Printing the original list and sublist
        System.out.println("Original List: " + originalList); // Output: [1, 2, 3, 4, 5, 6]
        System.out.println("Sublist: " + sublist); // Output: [10, 3, 4]
    }
}
