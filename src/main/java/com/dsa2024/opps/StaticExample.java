package com.dsa2024.opps;

public class StaticExample {
    static int staticVariable = 10;

    int instanceVariable = 20;

    static void staticMethod() {
        System.out.println("This is a static method.");
        System.out.println("Static variable: " + staticVariable);
    }

    void instanceMethod() {
        System.out.println("This is an instance method.");
        System.out.println("Instance variable: " + instanceVariable);
        System.out.println("Static variable: " + staticVariable);
    }

    // Static nested class
    static class StaticNestedClass {
        void display() {
            System.out.println("This is a static nested class.");
            System.out.println("Static variable from outer class: " + staticVariable);
        }
    }

    // Static block
    static {
        System.out.println("Static block executed.");
        staticVariable = 30;
    }

    public static void main(String[] args) {
        // Accessing static method
        StaticExample.staticMethod();

        // Creating instance of StaticExample
        StaticExample obj = new StaticExample();
        obj.instanceMethod();

        // Accessing static variable directly from the class
        System.out.println("Static variable accessed directly: " + StaticExample.staticVariable);

        // Creating instance of static nested class
        StaticExample.StaticNestedClass nestedObj = new StaticExample.StaticNestedClass();
        nestedObj.display();
    }
}
