package com.dsa2024.javaqa;

class Animal {
    public Animal makeSound() {
        System.out.println("Animal makes a sound");
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    public Dog makeSound() {
        System.out.println("Dog barks");
        return new Dog(); // Covariant return type: Dog is a subclass of Animal
    }
}

public class TestCovariant {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog animal = dog.makeSound();
        Animal animal1 = dog.makeSound(); // This will return an object of type Dog, not Animal
    }
}
