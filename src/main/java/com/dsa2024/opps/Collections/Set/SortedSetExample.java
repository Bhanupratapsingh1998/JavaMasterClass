package com.dsa2024.opps.Collections.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        // Create a SortedSet using TreeSet
        SortedSet<String> sortedSet = new TreeSet<>();

        // Add elements to the SortedSet
        sortedSet.add("Banana");
        sortedSet.add("Apple");
        sortedSet.add("Mango");
        sortedSet.add("Orange");

        // Print the SortedSet (will be sorted)
        System.out.println("SortedSet: " + sortedSet);

        // Accessing elements
        System.out.println("First Element: " + sortedSet.first());
        System.out.println("Last Element: " + sortedSet.last());

        // Subset operations
        SortedSet<String> subSet = sortedSet.subSet("Apple", "Orange");
        System.out.println("Subset from Apple to Orange: " + subSet);

        // HeadSet and TailSet operations
        SortedSet<String> headSet = sortedSet.headSet("Mango");
        System.out.println("HeadSet up to Mango: " + headSet);

        SortedSet<String> tailSet = sortedSet.tailSet("Mango");
        System.out.println("TailSet from Mango: " + tailSet);
    }
}
