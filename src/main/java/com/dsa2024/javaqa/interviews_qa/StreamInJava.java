package com.dsa2024.javaqa.interviews_qa;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamInJava {

    public static void main(String[] args) {

        List<String> strs = Arrays.asList(
                "Subham", "Rakes", "cHATBOT", "sRS", "Social Registry", "sRS"
        );

        // Print all elements (println for readability)
        System.out.println("All elements:");
        strs.forEach(System.out::println);

        // Convert all to lowercase
        List<String> lowerCase = strs.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println("Lowercase: " + lowerCase);

        // Count number of elements
        long count = strs.stream().count();
        System.out.println("Count: " + count);

        // Remove duplicates
        List<String> distinct = strs.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct: " + distinct);

        // Filter strings starting with 'S' (case-insensitive)
        List<String> startsWithS = strs.stream()
                .filter(x -> x.toUpperCase().startsWith("S"))
                .collect(Collectors.toList());
        System.out.println("Starts with S: " + startsWithS);

        // Count duplicates
        Map<String, Long> duplicates = strs.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println("Duplicates count: " + duplicates);

        // Sort alphabetically (case-insensitive)
        List<String> sorted = strs.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
        System.out.println("Sorted: " + sorted);

        // Find longest string
        Optional<String> longest = strs.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println("Longest String: " + longest.orElse("N/A"));

        // Join strings
        String joined = strs.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Joined String: " + joined);

        // Group by length
        Map<Integer, List<String>> groupByLength = strs.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Group by length: " + groupByLength);

        // Find first string with length > 6
        Optional<String> firstLong = strs.stream()
                .filter(x -> x.length() > 6)
                .findFirst();
        System.out.println("First length > 6: " + firstLong.orElse("N/A"));

        // Capitalize first letter (safe for empty strings)
        List<String> capitalized = strs.stream()
                .filter(x -> !x.isEmpty())
                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase())
                .collect(Collectors.toList());
        System.out.println("Capitalized: " + capitalized);

        // Numbers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);

        // Even numbers
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evens);

        // Odd numbers
        List<Integer> odds = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Odd Numbers: " + odds);

        // Sum
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + sum);

        // Max & Min
        System.out.println("Max: " + numbers.stream().max(Integer::compareTo).orElse(-1));
        System.out.println("Min: " + numbers.stream().min(Integer::compareTo).orElse(-1));

        // Second highest
        int secondHighest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println("Second Highest: " + secondHighest);

        // Second smallest
        int secondSmallest = numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println("Second Smallest: " + secondSmallest);

        // Count > 5
        System.out.println("Count > 5: " +
                numbers.stream().filter(n -> n > 5).count());

        // Sum > 5
        System.out.println("Sum > 5: " +
                numbers.stream().filter(n -> n > 5).mapToInt(Integer::intValue).sum());

        // Product
        long product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product);

        // Any divisible by 7
        System.out.println("Any divisible by 7: " +
                numbers.stream().anyMatch(n -> n % 7 == 0));

        // Partition even/odd
        Map<Boolean, List<Integer>> partition =
                numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Partition Even/Odd: " + partition);

        // Employees
        List<Map<String, Object>> emps = List.of(
                Map.of("id",1,"name","Subham","desg","Developer","sal",10000),
                Map.of("id",2,"name","Riju","desg","HR","sal",20000),
                Map.of("id",3,"name","Sankha","desg","Tester","sal",25000),
                Map.of("id",4,"name","xyz","desg","DBA","sal",20000),
                Map.of("id",5,"name","abc","desg","Developer","sal",40000)
        );

        // Employee names
        emps.stream()
                .map(e -> e.get("name"))
                .forEach(System.out::println);

        // Developers
        List<Map<String, Object>> devs = emps.stream()
                .filter(e -> "Developer".equals(e.get("desg")))
                .collect(Collectors.toList());
        System.out.println("Developers: " + devs);

        // Total salary
        int totalSalary = emps.stream()
                .mapToInt(e -> (Integer) e.get("sal"))
                .sum();
        System.out.println("Total Salary: " + totalSalary);

        // Group by designation
        Map<String, List<Map<String, Object>>> groupByDesg =
                emps.stream().collect(Collectors.groupingBy(e -> (String) e.get("desg")));
        System.out.println("Group by designation: " + groupByDesg);

        // Max salary employee
        Map<String, Object> maxSalaryEmp =
                emps.stream()
                        .max(Comparator.comparingInt(e -> (Integer) e.get("sal")))
                        .orElse(Map.of());
        System.out.println("Max Salary Emp: " + maxSalaryEmp);

        // Average salary
        double avgSalary =
                emps.stream().mapToInt(e -> (Integer) e.get("sal")).average().orElse(0);
        System.out.println("Average Salary: " + avgSalary);

        // Any HR
        boolean anyHR =
                emps.stream().anyMatch(e -> "HR".equals(e.get("desg")));
        System.out.println("Any HR: " + anyHR);
    }
}
