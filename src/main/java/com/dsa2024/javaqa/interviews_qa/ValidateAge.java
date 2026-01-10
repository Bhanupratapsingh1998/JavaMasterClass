package com.dsa2024.javaqa.interviews_qa;

public class ValidateAge {

    public static void main(String[] args) {
        int age = 15;
        validateAge(age);
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException(age);
        }
        System.out.println("Valid age: " + age);
    }
}

// Custom Runtime Exception
class InvalidAgeException extends RuntimeException {

    public InvalidAgeException() {
        super();
    }

    public InvalidAgeException(Integer age) {
        super("Age is not valid: " + age);
    }
}
