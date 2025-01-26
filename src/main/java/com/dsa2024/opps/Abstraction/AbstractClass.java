package com.dsa2024.opps.Abstraction;

abstract class Shape {
    abstract void draw();

    void move() {
        System.out.println("Moving the shape.");
    }

    void display() {
        System.out.println("display the shape.");
    }
}

class Circle extends Shape {
    Shape shape;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.draw();
        rectangle.draw();
        circle.display();
    }
}
