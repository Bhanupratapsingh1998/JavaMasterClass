package com.dsa2024.javaqa.solid;

// OCP Compliant Code: Shape Interface
interface Shape1 {
    double calculateArea();
}

// Circle class implementing Shape
class Circle implements Shape1 {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Square class implementing Shape
class Square implements Shape1 {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

// AreaCalculator class that calculates area for any Shape
class AreaCalculator {
    public double calculateArea(Shape1 shape) {
        return shape.calculateArea();
    }
}

public class OCPExample {
    public static void main(String[] args) {
        // Create instances of Circle and Square
        Shape1 circle = new Circle(5);
        Shape1 square = new Square(5);

        // Create AreaCalculator instance to calculate areas
        AreaCalculator areaCalculator = new AreaCalculator();

        // Calculate areas
        System.out.println("Area of Circle: " + areaCalculator.calculateArea(circle));
        System.out.println("Area of Square: " + areaCalculator.calculateArea(square));
    }
}
