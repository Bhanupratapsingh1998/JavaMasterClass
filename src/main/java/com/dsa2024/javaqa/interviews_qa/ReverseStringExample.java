package com.dsa2024.javaqa.interviews_qa;

public class ReverseStringExample {

    public static void main(String[] args) {
        String str = "Narendra";

        System.out.println("Original String : " + str);

        // 1. Using StringBuilder
        System.out.println("Using StringBuilder : " + reverseUsingStringBuilder(str));

        // 2. Using for loop
        System.out.println("Using for loop       : " + reverseUsingLoop(str));

        // 3. Using char array
        System.out.println("Using char array     : " + reverseUsingCharArray(str));
    }

    // Method 1: StringBuilder
    public static String reverseUsingStringBuilder(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Method 2: for loop
    public static String reverseUsingLoop(String input) {
        StringBuilder rev = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            rev.append(input.charAt(i));
        }
        return rev.toString();
    }

    // Method 3: char array
    public static String reverseUsingCharArray(String input) {
        char[] arr = input.toCharArray();
        StringBuilder rev = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            rev.append(arr[i]);
        }
        return rev.toString();
    }
}

