package com.dsa2024.opps.Constructor.Constructor_With_Exception;

class Person {
    private String name;
    private int age;

    // Constructor that throws an exception
    public Person(String name, int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age must be between 0 and 150.");
        }
        this.name = name;
        this.age = age;
        System.out.println("Person created: " + name + ", Age: " + age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Main {
    public static void main(String[] args) {
        try {
            Person p1 = new Person("Alice", 30);
            Person p2 = new Person("Bob", -5); // This will throw an exception
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
