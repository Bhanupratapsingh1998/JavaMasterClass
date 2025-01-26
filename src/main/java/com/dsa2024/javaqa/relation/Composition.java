package com.dsa2024.javaqa.relation;
class Engine {
    private final String engineType;

    public Engine(String engineType) {
        this.engineType = engineType;
    }

    public void start() {
        System.out.println("Engine type " + engineType + " is starting.");
    }
}

class Car {
    private final String make;
    private final Engine engine;

    public Car(String make, String engineType) {
        this.make = make;
        this.engine = new Engine(engineType);  // Composition: Engine is part of Car
    }

    public void startCar() {
        System.out.println("Starting the car: " + make);
        engine.start();  // Car starts the engine
    }
}

public class Composition {
    public static void main(String[] args) {
        // Creating a Car object
        Car car = new Car("Toyota", "V6");

        // Starting the car
        car.startCar();
    }
}
