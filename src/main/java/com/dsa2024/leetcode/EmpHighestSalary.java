package com.dsa2024.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Adding employee data
        employees.add(new Employee("Alice", 55000));
        employees.add(new Employee("Bob", 62000));
        employees.add(new Employee("Charlie", 48000));
        employees.add(new Employee("Diana", 73000));
        employees.add(new Employee("Praveen", 64000));
        employees.add(new Employee("Bhanu", 64000));

        List<Employee> secondHighest = fetchSecondHighestSalary(employees);
        List<Employee> secondHighestWithDup = fetchSecondHighestSalaryWithDup(employees);

        System.out.println("Second Highest");
        secondHighest.forEach(e -> System.out.println(e.getName()+" : "+e.getSalary()));
        List<Employee> fList = filterNames(employees);

        System.out.println("\nStart with P and End with n");
        fList.forEach(e -> System.out.println(e.getName()+" : "+e.getSalary()));

    }

    private static List<Employee> fetchSecondHighestSalary(List<Employee> employees) {
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .map(Employee::getSalary)
                .distinct()
                .skip(1)
                .findFirst()
                .map(secondHighestSalary -> employees.stream()
                        .filter(e -> e.getSalary() == secondHighestSalary)
                        .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }
    private static List<Employee> fetchSecondHighestSalaryWithDup(List<Employee> employees) {
        // Step 1: find the second highest distinct salary
        Optional<Double> secondHighestSalary = employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
    
        if (secondHighestSalary.isEmpty()) {
            return Collections.emptyList();
        }
    
        double target = secondHighestSalary.get();
    
        // Step 2: return all employees who have that salary
        return employees.stream()
                .filter(e -> Double.compare(e.getSalary(), target) == 0)
                .collect(Collectors.toList());
    }
    
    private static List<Employee> filterNames(List<Employee> employees) {
        return employees.stream()
        .filter(e-> e.getName().startsWith("P") && e.getName().endsWith("n")).toList();
    }

}
