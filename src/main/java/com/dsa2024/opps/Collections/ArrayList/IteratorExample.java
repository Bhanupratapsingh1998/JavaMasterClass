package com.dsa2024.opps.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("Banana")) {
                iterator.remove(); // This is safe and does not cause ConcurrentModificationException
            }
        }

        System.out.println(list); // Output: [Apple, Cherry, Date]
    }
}
