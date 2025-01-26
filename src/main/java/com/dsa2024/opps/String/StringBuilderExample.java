package com.dsa2024.opps.String;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // Append text
        sb.append(" World");
        System.out.println("After append: " + sb); // Output: "Hello World"

        // Insert text
        sb.insert(5, ",");
        System.out.println("After insert: " + sb); // Output: "Hello, World"

        // Delete text
        sb.delete(5, 6);
        System.out.println("After delete: " + sb); // Output: "Hello World"

        // Delete a character at a specific position
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb); // Output: "HelloWorld"

        // Reverse the text
        sb.reverse();
        System.out.println("After reverse: " + sb); // Output: "dlroWolleH"

        // Set a character at a specific position
        sb.setCharAt(0, 'H');
        System.out.println("After setCharAt: " + sb); // Output: "HlroWolleH"

        // Convert to String
        String result = sb.toString();
        System.out.println("Converted to String: " + result); // Output: "HlroWolleH"
    }
}
