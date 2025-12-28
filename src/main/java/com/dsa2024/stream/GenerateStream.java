package com.dsa2024.stream;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class GenerateStream {
    private static Stream<String> stream;

    public static void main(String[] args) {
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "hello stream";
            }
        };
        /*
         * Consumer<String> consumer = new Consumer<String>() {
         * 
         * @Override
         * public void accept(String str) {
         * System.out.println("Printing the String: " + str);
         * }
         * 
         * };
         */

        Consumer<String> consumer = str -> System.out.println("Printing the String: " + str);
        stream = Stream.generate(supplier);
        stream.forEach(consumer);
    }
}
