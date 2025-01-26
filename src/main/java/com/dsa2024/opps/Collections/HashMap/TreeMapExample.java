package com.dsa2024.opps.Collections.HashMap;

import java.util.TreeMap;

class Employee implements Comparable<Employee> {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Implement the compareTo method for natural ordering
    @Override
    public int compareTo(Employee other) {
        // Compare by age first, then name
        if (this.age != other.age) {
            return this.age - other.age;
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + '}';
    }
}

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap with Employee as the key
        TreeMap<Employee, String> map = new TreeMap<>();

        // Add entries to the map
        Employee p1 = new Employee("Alice", 30);
        Employee p2 = new Employee("Bob", 25);
        Employee p3 = new Employee("Alice", 30); // Same name and age as p1

        map.put(p1, "Software Engineer");
        map.put(p2, "Data Scientist");

        // Since p1 and p3 have the same age and name, p3 will overwrite p1
        map.put(p3, "Architect");

        // Print the map contents
        System.out.println(map);
    }
}
