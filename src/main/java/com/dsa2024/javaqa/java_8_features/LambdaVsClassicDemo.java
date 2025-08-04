package com.dsa2024.javaqa.java_8_features;

import java.util.*;
import java.util.function.*;

public class LambdaVsClassicDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Jack", "Jill");
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1));

        System.out.println("=== Runnable ===");
        // Without lambda: anonymous class
        Runnable classicRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Classic Runnable says hello");
            }
        };
        new Thread(classicRunnable).start();

        // With lambda
        Runnable lambdaRunnable = () -> System.out.println("Lambda Runnable says hello");
        new Thread(lambdaRunnable).start();

        sleep(100); // small pause to let threads print

        System.out.println("\n=== Iteration (forEach) ===");
        // Without lambda: using loop
        System.out.println("Classic iteration:");
        for (String name : names) {
            System.out.println("  " + name);
        }
        // With lambda
        System.out.println("Lambda forEach:");
        names.forEach(name -> System.out.println("  " + name));

        System.out.println("\n=== Sorting ===");
        // Without lambda: anonymous Comparator
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });
        System.out.println("Classic sorted numbers: " + numbers);

        // With lambda (reshuffle to unsorted then sort again)
        numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1));
        numbers.sort((a, b) -> a - b);
        System.out.println("Lambda sorted numbers:  " + numbers);

        System.out.println("\n=== Filtering + Mapping ===");
        // Without lambda: manual filter & transform
        List<String> jNamesClassic = new ArrayList<>();
        for (String n : names) {
            if (n.startsWith("J")) {
                jNamesClassic.add(n.toUpperCase());
            }
        }
        System.out.println("Classic filtered & uppercased: " + jNamesClassic);

        // With lambda + streams
        List<String> jNamesLambda = names.stream()
                .filter(n -> n.startsWith("J"))
                .map(String::toUpperCase)
                .toList();
        System.out.println("Lambda stream result:         " + jNamesLambda);

        System.out.println("\n=== Custom Functional Interface ===");
        // Classic: anonymous class implementation
        MessageFormatter classicFormatter = new MessageFormatter() {
            @Override
            public String format(String msg) {
                return "~~ " + msg + " ~~";
            }
        };
        System.out.println("Classic formatted: " + classicFormatter.format("Hello"));

        // Lambda implementation
        MessageFormatter lambdaFormatter = msg -> "~~ " + msg + " ~~";
        System.out.println("Lambda formatted:  " + lambdaFormatter.format("Hello"));

        System.out.println("\n=== java.util.function usage ===");
        // Predicate and Consumer without lambda: using anonymous classes
        Predicate<Integer> isEvenClassic = new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return x % 2 == 0;
            }
        };
        Consumer<Integer> printerClassic = new Consumer<Integer>() {
            @Override
            public void accept(Integer x) {
                if (isEvenClassic.test(x)) {
                    System.out.println("Classic even: " + x);
                }
            }
        };
        numbers.forEach(printerClassic);

        // With lambdas
        Predicate<Integer> isEvenLambda = x -> x % 2 == 0;
        Consumer<Integer> printerLambda = x -> {
            if (isEvenLambda.test(x)) {
                System.out.println("Lambda even:  " + x);
            }
        };
        numbers.forEach(printerLambda);
    }

    // helper to avoid InterruptedException boilerplate
    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ignored) {
        }
    }

    @FunctionalInterface
    interface MessageFormatter {
        String format(String message);
    }
}

