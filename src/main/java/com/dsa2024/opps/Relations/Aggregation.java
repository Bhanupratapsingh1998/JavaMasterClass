package com.dsa2024.opps.Relations;

import java.util.List;
import java.util.ArrayList;

// Employee class
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Department class
class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Department dept = new Department("HR");
        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Employee("Bob");

        dept.addEmployee(emp1);
        dept.addEmployee(emp2);

        for (Employee emp : dept.getEmployees()) {
            System.out.println(emp.getName() + " works in " + dept.getName());
        }
    }
}
