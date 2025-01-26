package com.dsa2024.opps.Abstraction;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class functionalInterface {
    public static void main(String[] args) {
        // Using lambda expression
        Calculator addition = (a, b) -> a + b;
        Calculator multiplication = (a, b) -> a * b;

        System.out.println("Addition: " + addition.calculate(5, 3));
        System.out.println("Multiplication: " + multiplication.calculate(5, 3));
    }
}
