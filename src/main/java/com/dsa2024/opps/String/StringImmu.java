package com.dsa2024.opps.String;

public class StringImmu {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        System.out.println("Before concat str1: " + str1); // Output: hello

        System.out.println("str1 == str2: " + (str1 == str2)); // Output: true

        str1 += " world";
        System.out.println("After concat: " + str1); // Output: hello world
        System.out.println("str1 == str2: " + (str1 == str2)); // Output: false

        // str1.concat(" world");
        // System.out.println("After concat: " + str1); // Output: hello
        // System.out.println("str2: " + str2); // Output: hello
        // System.out.println("str1 == str2: " + (str1 == str2)); // Output: true
    }
}
