package com.dsa2024.javaqa.solid;

// LSP Violating Code
class Rectangle2 {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square2 extends Rectangle2 {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); // Ensures both sides are equal
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height); // Ensures both sides are equal
        super.setHeight(height);
    }
}

public class LSPViolation {
    public static void main(String[] args) {
        Rectangle2 rectangle = new Rectangle2();
        rectangle.setWidth(4);
        rectangle.setHeight(5);
        System.out.println("Rectangle area: " + rectangle.getArea()); // Prints 20

        Rectangle2 square = new Square2();
        square.setWidth(4);
        square.setHeight(5); // Violates expectations: changes both width and height
        System.out.println("Square area: " + square.getArea()); // Unexpected result: 25
    }
}
