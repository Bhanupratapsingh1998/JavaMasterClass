package com.dsa2024.opps.Collections.Map;

import java.util.TreeMap;
import java.util.Comparator;

public class CustomComparatorTreeMap {
    public static void main(String[] args) {
        // Creating a TreeMap with a custom comparator that compares string
        // representations of keys
        TreeMap<Object, Integer> treeMap = new TreeMap<>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        // Adding heterogeneous key-value pairs
        treeMap.put("Apple", 10); // String key
        treeMap.put(1, 20); // Integer key
        treeMap.put(3.14, 30); // Double key

        // Displaying the TreeMap
        System.out.println("TreeMap with custom comparator: " + treeMap);
    }
}
