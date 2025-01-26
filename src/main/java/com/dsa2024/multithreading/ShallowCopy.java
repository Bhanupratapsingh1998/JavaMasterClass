package com.dsa2024.multithreading;

class Address {
    String city;
    String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Original object
        Address address = new Address("New York", "USA");
        Person person1 = new Person("John", address);

        // Create a shallow copy
        Person person2 = (Person) person1.clone();

        // Display original and copied object details
        System.out.println("Original Person: " + person1.name + ", " + person1.address.city + ", " + person1.address.country);
        System.out.println("Copied Person: " + person2.name + ", " + person2.address.city + ", " + person2.address.country);

        // Modify the address of the copied object
        person2.address.city = "Los Angeles";

        // Changes reflect in both objects because the address field is shared (shallow copy)
        System.out.println("\nAfter modifying the copied object's address:");
        System.out.println("Original Person: " + person1.name + ", " + person1.address.city + ", " + person1.address.country);
        System.out.println("Copied Person: " + person2.name + ", " + person2.address.city + ", " + person2.address.country);
    }
}

