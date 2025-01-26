package com.dsa2024.opps.String;

public class IndexOfExample {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Find the index of the first occurrence of 'o'
        int indexOfO = str.indexOf('o');
        System.out.println("Index of 'o': " + indexOfO); // Output: 4

        // Find the index of the first occurrence of "World"
        int indexOfWorld = str.indexOf("World");
        System.out.println("Index of 'World': " + indexOfWorld); // Output: 7

        // Find the index of the first occurrence of 'o' starting from index 5
        int indexOfOFromIndex5 = str.indexOf('o', 5);
        System.out.println("Index of 'o' from index 5: " + indexOfOFromIndex5); // Output: 8

        // Find the index of a substring that does not exist
        int indexOfNonExistent = str.indexOf("Java");
        System.out.println("Index of 'Java': " + indexOfNonExistent); // Output: -1
    }
}
