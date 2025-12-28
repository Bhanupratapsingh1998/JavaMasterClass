package com.dsa2024.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstAndAny {

        public static void main(String[] args) {
                List<Integer> numbers = Arrays.asList(3, 7, 10, 4, 9, 2, 5, 8);

                // Using findFirst to find the first even number
                Optional<Integer> firstEven = numbers.stream()
                                .filter(n -> n % 2 == 0)
                                .findFirst();
                firstEven.ifPresentOrElse(
                                n -> System.out.println("First even number: " + n),
                                () -> System.out.println("No even number found"));

                // Using findAny to find any even number
                Optional<Integer> anyEven = numbers.parallelStream()
                                .filter(n -> n % 2 == 0)
                                .findAny();
                anyEven.ifPresentOrElse(
                                n -> System.out.println("Any even number: " + n),
                                () -> System.out.println("No even number found"));
        }
}
