package com.dsa2024.stream;

public class MethodReference {
    public static void main(String[] args) {
        // Anonymous class implementation
        Calculator calc1 = new Calculator() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Anonymous class sum: " + calc1.sum(5, 3));

        // Lambda implementation
        Calculator calc2 = (a, b) -> a + b;
        System.out.println("Lambda sum: " + calc2.sum(5, 4));

        // Static method reference
        Calculator calc3 = MethodReference::addNumbers;
        System.out.println("Method reference sum: " + calc3.sum(5, 5));

        // static method reference in Integer class
        Calculator calc4 = Integer::sum;
        System.out.println("Method reference Integer sum : " + calc4.sum(10, 20));

        IPrint iPrint = MethodReference::printStr;
        iPrint.printData("Something about return type concepts.");

        IPrint iPrint1 = MethodReference::printStr1;
        iPrint1.printData("Something about return type concepts.");
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void printStr(String str) {
        System.out.println(str);
    }

    public static String printStr1(String str) {
        System.out.println(str);
        return str;
    }
}
