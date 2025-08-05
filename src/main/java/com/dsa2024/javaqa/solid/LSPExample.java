package com.dsa2024.javaqa.solid;

// LSP Compliant Code
/*Objects of a superclass should be replaceable with objects of its subclasses without altering the correctness of the program.
 * If S is a subclass of T, then we should be able to replace T with S without breaking functionality.
*/
abstract class Shape3 {
    public abstract int getArea();
}

class Rectangle extends Shape3 {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}

class Square3 extends Shape3 {
    private int side;

    public Square3(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}

public class LSPExample {
    public static void main(String[] args) {
        Shape3 rectangle = new Rectangle(4, 5);
        System.out.println("Rectangle area: " + rectangle.getArea()); // Prints 20

        Shape3 square = new Square3(4);
        System.out.println("Square area: " + square.getArea()); // Prints 16
    }
}
