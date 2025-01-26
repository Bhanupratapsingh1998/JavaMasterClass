package com.dsa2024.javaqa.solid;

// OCP Violating Code: Shape class directly calculates area based on shape type
 class Shape2 {
    public double calculateArea(String shapeType) {
        if (shapeType.equals("Circle")) {
            return Math.PI * 5 * 5;  // Assume a circle with radius 5
        } else if (shapeType.equals("Square")) {
            return 5 * 5;  // Assume a square with side 5
        }
        return 0;
    }
}

public class OCPViolating {
    public static void main(String[] args) {
        // Create Shape instance and calculate areas
        Shape2 shape = new Shape2();
        System.out.println("Area of Circle: " + shape.calculateArea("Circle"));
        System.out.println("Area of Square: " + shape.calculateArea("Square"));
    }
}
