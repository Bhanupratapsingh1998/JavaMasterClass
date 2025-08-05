package com.dsa2024.leetcode;

public class Employee {
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
     // equals/hashCode only on salary
     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (!(o instanceof Employee)) return false;
         Employee other = (Employee) o;
         return Double.compare(salary, other.salary) == 0;
     }
 
     @Override
     public int hashCode() {
         return Double.hashCode(salary);
     }
}
