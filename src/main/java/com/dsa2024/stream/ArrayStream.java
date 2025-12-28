package com.dsa2024.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ArrayStream {
    public static void main(String[] args) {
        Integer num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Stream<Integer> stream = Arrays.stream(num);
        stream.filter(e -> e > 5).forEach(e -> System.out.println(e));

        // Getting second highest salary using in stream
        Integer a = Stream.of(num).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Secod highest no is " + a);
    }
}
