package com.dsa2024.opps.String;

public class ValueOfExample {
    public static void main(String[] args) {
        int intValue = 42;
        double doubleValue = 3.14159;
        boolean boolValue = true;
        char charValue = 'A';
        char[] charArray = { 'J', 'a', 'v', 'a' };
        Object obj = new Object();

        // Convert int to String
        String intStr = String.valueOf(intValue);
        System.out.println("String value of int: " + intStr); // Output: "42"

        // Convert double to String
        String doubleStr = String.valueOf(doubleValue);
        System.out.println("String value of double: " + doubleStr); // Output: "3.14159"

        // Convert boolean to String
        String boolStr = String.valueOf(boolValue);
        System.out.println("String value of boolean: " + boolStr); // Output: "true"

        // Convert char to String
        String charStr = String.valueOf(charValue);
        System.out.println("String value of char: " + charStr); // Output: "A"

        // Convert char array to String
        String charArrayStr = String.valueOf(charArray);
        System.out.println("String value of char array: " + charArrayStr); // Output: "Java"

        // Convert Object to String
        String objStr = String.valueOf(obj);
        System.out.println("String value of object: " + objStr); // Output: "java.lang.Object@<hashcode>"
    }
}
