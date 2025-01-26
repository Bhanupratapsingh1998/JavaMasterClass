package com.dsa2024.opps.Collections.Stack;

import java.util.Stack;

public class BasicStackOperations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushes: " + stack);

        // Popping elements from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);

        // Peeking the top element
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Checking if the stack is empty
        boolean isEmpty = stack.empty();
        System.out.println("Is stack empty? " + isEmpty);

        // Searching for an element
        int position = stack.search(20); // Returns the 1-based position from the top of the stack
        System.out.println("Position of 20 in stack: " + position);
    }
}
