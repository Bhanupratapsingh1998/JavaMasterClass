package com.dsa2024.javaqa.interviews_qa;
import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class HighestSalaryByDepartment {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Amit", "IT", 90000),
                new Employee("Rahul", "IT", 70000),
                new Employee("Priya", "HR", 75000),
                new Employee("Neha", "HR", 65000),
                new Employee("Suresh", "Finance", 85000)
        );

        Map<String, Double> result =
                employees.stream()
                         .collect(Collectors.groupingBy(
                             Employee::getDepartment,
                             Collectors.collectingAndThen(
                                 Collectors.maxBy(
                                     Comparator.comparingDouble(Employee::getSalary)
                                 ),
                                 opt -> opt.map(Employee::getSalary).orElse(0.0)
                             )
                         ));

        result.forEach((dept, salary) ->
                System.out.println(dept + " -> " + salary)
        );
    }
}