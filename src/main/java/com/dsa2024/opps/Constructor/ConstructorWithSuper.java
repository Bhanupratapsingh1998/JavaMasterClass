package com.dsa2024.opps.Constructor;

// Superclass
class Person1 {
    String name;

    // Constructor for Person
    public Person1(String name) {
        this.name = name;
        System.out.println("Person constructor called");
    }
}

// Subclass
class Employee extends Person1 {
    int employeeId;

    // Constructor for Employee
    public Employee(String name, int employeeId) {
        super(name); // Call to superclass (Person) constructor
        this.employeeId = employeeId;
        System.out.println("Employee constructor called");
    }

    // Method to display employee details
    public void display() {
        System.out.println("Name: " + name + ", Employee ID: " + employeeId);
    }
}

// Main class to test the implementation
public class ConstructorWithSuper {
    public static void main(String[] args) {
        Employee emp = new Employee("Bhanu", 101);
        emp.display();
    }
}
