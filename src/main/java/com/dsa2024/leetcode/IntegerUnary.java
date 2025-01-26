package com.dsa2024.leetcode;

public class IntegerUnary {
    static Integer x = 5;

    public static void main(String[] args) {
        System.out.println("Before increment: x = " + x); // Print initial value (5)

        System.out.println("HashCode before increment: " + System.identityHashCode(x));

        add();

        System.out.println("After increment: x = " + x); // Print the new value (6)

        System.out.println("HashCode after increment: " + System.identityHashCode(x));
    }

    public static void add() {
        x++; // This works due to auto-boxing and unboxing
    }

}
