package com.dsa2024.javaqa;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            int result = 10 / 0; // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // Code that will always execute
            System.out.println("Execution completed.");
        }
    }
}

