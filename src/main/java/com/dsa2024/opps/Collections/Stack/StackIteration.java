package com.dsa2024.opps.Collections.Stack;

import java.util.Stack;
import java.util.Iterator;

public class StackIteration {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Using for-each loop
        System.out.println("Using for-each loop:");
        for (String fruit : stack) {
            System.out.println(fruit);
        }

        // Using iterator
        System.out.println("Using iterator:");
        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using for loop with index
        System.out.println("Using for loop with index:");
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
    }
}
