package com.dsa2024.stream;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        /*
         * Definition: A Consumer represents an operation that accepts a single input
         * argument and returns no result. It is typically used for operations like
         * printing, logging, or modifying objects.
         * Method: void accept(T t)
         * Scenario: Imagine you have a list of employees, and you want to give each of
         * them a 10% raise and then print their updated salary.
         * Use : when you need to perform an action (like printing or modifying) on an
         * object
         */
        Employee emp = new Employee(1, "John Doe", 50000, "IT");
        System.out.println(emp);

        // Giving a raise using Consumer
        Consumer<Employee> giveRaise = employee -> employee.setSalary(employee.getSalary() * 1.10);
        giveRaise.accept(emp);

        // Printing updated salary
        System.out.println("Updated Salary: " + emp.getSalary());

    }
}
