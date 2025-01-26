package com.dsa2024.opps.Constructor;

interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    private String model;
    private int year;

    // Constructor for the Car class
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Implement the drive method from the Vehicle interface
    @Override
    public void drive() {
        System.out.println("Driving the " + model + " car, model year " + year);
    }
}

public class ConstructorWithInterface {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022);
        myCar.drive();
    }
}
