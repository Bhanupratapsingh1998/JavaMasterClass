package com.dsa2024.opps.Collections;

import java.util.Vector;

public class VectorExamples {
    public static void main(String[] args) {
        // Example 1: Default Constructor (Initial Capacity 10, Doubling Growth)
        Vector<Integer> vector1 = new Vector<>();
        for (int i = 1; i <= 15; i++) {
            vector1.add(i);
        }
        System.out.println("Example 1 - Default Constructor:");
        System.out.println("Vector: " + vector1);
        System.out.println("Capacity: " + vector1.capacity());
        System.out.println();

        // Example 2: Initial Capacity Specified
        Vector<Integer> vector2 = new Vector<>(5);
        for (int i = 1; i <= 10; i++) {
            vector2.add(i);
        }
        System.out.println("Example 2 - Initial Capacity Specified:");
        System.out.println("Vector: " + vector2);
        System.out.println("Capacity: " + vector2.capacity());
        System.out.println();

        // Example 3: Initial Capacity and Capacity Increment Specified
        Vector<Integer> vector3 = new Vector<>(5, 3);
        for (int i = 1; i <= 15; i++) {
            vector3.add(i);
        }
        System.out.println("Example 3 - Initial Capacity and Capacity Increment Specified:");
        System.out.println("Vector: " + vector3);
        System.out.println("Capacity: " + vector3.capacity());
        System.out.println();

        // Example 4: Checking Capacity Changes
        Vector<Integer> vector4 = new Vector<>(5, 3);
        System.out.println("Example 4 - Checking Capacity Changes:");
        for (int i = 1; i <= 15; i++) {
            vector4.add(i);
            System.out.println("Added element: " + i + ", Current capacity: " + vector4.capacity());
        }
    }
}
