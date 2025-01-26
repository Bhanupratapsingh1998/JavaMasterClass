package com.dsa2024.opps.Collections.ArrayList;

import java.util.ArrayList;

public class ForLoopExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("Banana")) {
                list.remove(i); // This can cause ConcurrentModificationException
            }
        }

        System.out.println(list); // Output: [Apple, Cherry, Date]
    }
}
