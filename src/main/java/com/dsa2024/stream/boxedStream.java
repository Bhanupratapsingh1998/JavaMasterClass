package com.dsa2024.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class boxedStream {
    public static void main(String[] args) {
        // Calculate the sum of squares of even numbers in a range, then collect the
        // results into a list
        IntStream intStream = IntStream.range(1, 10);

        List<Integer> squaredEvens = intStream
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .boxed() // Convert to Stream<Integer>
                .collect(Collectors.toList());

        System.out.println(squaredEvens);
        // Output: [4, 16, 36, 64]

    }
}
