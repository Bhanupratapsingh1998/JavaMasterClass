package com.dsa2024.opps.Abstraction.InterfaceExamples;

/* We can't accsess modifier private or protected and default ,public and abstract can be used*/
// abstract interface defaultInterfaceExample {
//     int x = 10;
//     void start();
//     default void stop() {
//         System.out.println("The vehicle is stopping.");
//     }
// }
interface MyInterface {
    int x = 10;

    void start(); // Abstract method, no body needed

    default void stop() {
        System.out.println("The vehicle is stopping.");
    }

    static void maintenance() {
        System.out.println("Performing maintenance check.");
    }

    static int getX() {
        return x;
    }

    // private void privateMethod() {
    // System.out.println("Private method in MyInterface.");
    // }

    // default void defaultMethod() {
    // privateMethod();
    // }
}

class Car implements MyInterface {
    @Override
    public void start() {
        System.out.println("The car is starting.");
    }
}

class Bike implements MyInterface {
    @Override
    public void start() {
        System.out.println("The bike is starting.");
    }

    @Override
    public void stop() {
        System.out.println("The bike is stopping.");
    }
}

public class InterfaceExamples {
    public static void main(String[] args) {
        MyInterface car = new Car();
        car.start(); // Output: The car is starting.
        car.stop(); // Output: The vehicle is stopping.

        MyInterface bike = new Bike();
        bike.start(); // Output: The bike is starting.
        bike.stop(); // Output: The bike is stopping.

        // Calling static methods on the interface
        MyInterface.maintenance(); // Output: Performing maintenance check.
        System.out.println("Value of x: " + MyInterface.getX()); // Output: Value of x: 10
    }
}
