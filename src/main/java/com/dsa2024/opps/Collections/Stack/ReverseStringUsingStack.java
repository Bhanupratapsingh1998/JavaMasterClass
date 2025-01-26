package com.dsa2024.opps.Collections.Stack;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String input = "Hello, World!";
        Stack<Character> stack = new Stack<>();

        // Push all characters of the string onto the stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // Pop characters from the stack to get the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed.toString());
    }
}
