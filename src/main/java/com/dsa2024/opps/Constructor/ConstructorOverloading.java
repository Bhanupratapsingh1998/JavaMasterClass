package com.dsa2024.opps.Constructor;

class Box {
    private double width, height, depth;

    // Constructor with no parameters
    public Box() {
        width = height = depth = 0;
    }

    // Constructor with three parameters
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Constructor with one parameter
    public Box(double side) {
        width = height = depth = side;
    }

    // Method to calculate and return the volume of the box
    public double volume() {
        return width * height * depth;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Using different constructors
        Box box1 = new Box();
        Box box2 = new Box(10, 20, 30);
        Box box3 = new Box(7);

        // Displaying volumes of boxes
        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2: " + box2.volume());
        System.out.println("Volume of box3: " + box3.volume());
    }
}
