package com.dsa2024.opps.Constructor;

public class ConstructorWithThis {
    private int x;
    private int y;

    // Constructor 1
    public ConstructorWithThis() {
        this(0, 0); // Calls Constructor 3
        System.out.println("Default constructor");
    }

    // Constructor 2
    public ConstructorWithThis(int x) {
        this(x, 0);
        System.out.println("One-parameter constructor");
    }

    // Constructor 3
    public ConstructorWithThis(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Two-parameter constructor");
    }

    public static void main(String[] args) {
        ConstructorWithThis ex = new ConstructorWithThis();
    }
}
