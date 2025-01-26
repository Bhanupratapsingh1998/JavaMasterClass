package com.dsa2024.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    public static void main(String[] args) {
        /*
         * Definition: A Predicate represents a function that takes a single input
         * argument and returns a boolean value. It is typically used for filtering or
         * matching conditions.
         * Method: boolean test(T t)
         * Scenario: Suppose you have a list of numbers, and you want to filter out all
         * the numbers greater than 10.
         * Use : when you need to check a condition or filter items
         */

        List<Integer> numbers = Arrays.asList(5, 8, 13, 21, 3, 10);

        // Predicate to filter numbers greater than 10
        Predicate<Integer> isGreaterThanTen = num -> num > 10;

        // Filter and collect numbers greater than 10
        List<Integer> filteredNumbers = numbers.stream()
                .filter(isGreaterThanTen)
                .collect(Collectors.toList());

        // Without use direct predicate
        List<Integer> filteredNums = numbers.stream()
                .filter(n -> n > 10)
                .collect(Collectors.toList());

        System.out.println(filteredNumbers); // Output: [13, 21]

    }
}
