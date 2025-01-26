package com.dsa2024.leetcode;

public class printAndPrintf {
    /*
     * %s: Inserts a string.
     * %d: Inserts a decimal (integer).
     * %f: Inserts a floating-point number (e.g., 3.14).
     * %n: Inserts a newline character (platform-independent).
     * %.xf: Controls the precision of floating-point numbers, where x is the number
     * of decimal
     */
    public static void main(String[] args) {
        System.out.printf("Hello, %s! You have %d new messages.%n", "Bhanu", 5);
        System.out.printf("Pi approximately equals %.2f", 3.14159);

    }
}
