package com.dsa2024.opps.Collections;

import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
    /*Fail-Safe: Use for concurrent access without risking exceptions.
     * Multi-threaded environments where modifications are expected.
    */
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String item : list) {
            System.out.println(item);
            // Structural modification: adding an element while iterating
            list.add("D");
        }

        System.out.println("Final list: " + list);
    }
}
