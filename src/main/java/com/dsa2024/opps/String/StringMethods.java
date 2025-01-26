package com.dsa2024.opps.String;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Substring from index 7
        String substring = str.substring(7);
        System.out.println("Substring from index 7: " + substring);

        // Check if contains "World"
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);

        // Replace 'l' with 'p'
        String replaced = str.replace('l', 'p');
        System.out.println("Replaced 'l' with 'p': " + replaced);

        // Trim leading and trailing spaces
        String trimmed = str.trim();
        System.out.println("Trimmed: " + trimmed);

        // Split the string by comma
        String[] splitArray = str.split(",");
        System.out.println("Split by comma: " + Arrays.toString(splitArray));
    }
}
