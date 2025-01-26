package com.dsa2024.opps.Constructor;

class Address {
    private String city;
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public Address(Address address) {
        this.city = address.city;
        this.country = address.country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return city + ", " + country;
    }
}

class Person {
    private String name;
    private int age;
    private Address address;

    // Constructor
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Copy constructor (shallow copy)
    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
        this.address = person.address; // Shallow copy
    }

    // Copy constructor (deep copy)
    public Person(Person person, boolean deepCopy) {
        this.name = person.name;
        this.age = person.age;
        if (deepCopy) {
            this.address = new Address(person.address); // Deep copy
        } else {
            this.address = person.address; // Shallow copy
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return name + " (" + age + ") - " + address;
    }
}

public class ConstructorWithCopy {
    public static void main(String[] args) {
        Address address1 = new Address("New York", "USA");
        Person person1 = new Person("John Doe", 30, address1);

        // Using the shallow copy constructor
        Person person2 = new Person(person1);
        // Using the deep copy constructor
        Person person3 = new Person(person1, true);

        System.out.println("Original person: " + person1);
        System.out.println("Shallow copied person: " + person2);
        System.out.println("Deep copied person: " + person3);

        // Modify the address of the original person
        address1.setCity("Los Angeles");

        System.out.println("\nAfter modifying the address of the original person:");
        System.out.println("Original person: " + person1);
        System.out.println("Shallow copied person: " + person2);
        System.out.println("Deep copied person: " + person3);
    }
}
