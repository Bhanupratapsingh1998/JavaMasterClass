package com.dsa2024.stream;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierDemo {
    public static void main(String[] args) {
        /*
         * Definition: A Supplier represents a function that supplies a result without
         * taking any input. It is typically used for providing instances or generating
         * values.
         * Method: T get()
         * Scenario: Suppose you need to generate a list of random numbers.
         * Use : when you need to generate or provide objects, often without any input.
         */
        Random random = new Random();

        // Supplier to generate a random number
        Supplier<Integer> randomNumberSupplier = () -> random.nextInt(100);

        // Generate a list of 5 random numbers
        List<Integer> randomNumbers = Stream.generate(randomNumberSupplier)
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(randomNumbers); // Output: [random numbers]

    }
}
