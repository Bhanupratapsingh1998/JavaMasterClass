package com.dsa2024.javaqa.java_8_features;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.StampedLock;
import java.util.function.*;
import java.util.stream.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

// Demonstrates many Java 8 features
public class Java8FeaturesDemo {

    // Functional interface (single abstract method) with default/static methods
    @FunctionalInterface
    interface StringProcessor {
        String process(String input);

        // default method
        default String processTwice(String input) {
            return process(process(input));
        }

        // static method
        static String emptyIfNull(String input) {
            return input == null ? "" : input;
        }
    }

    // Lambda expressions, method reference, Optional, Stream API, Collectors
    public static void collectionsAndStreamsDemo() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", null, "Frank");

        // Using Optional to avoid nulls safely
        Optional<String> maybeName = Optional.ofNullable(names.get(5)); // null entry
        System.out.println("Optional present? " + maybeName.isPresent());
        System.out.println("Default when empty: " + maybeName.orElse("DefaultName"));

        // Stream: filter, map, method reference, collect, grouping
        Map<Integer, List<String>> groupedByLength = names.stream()
                .filter(Objects::nonNull)                 // method reference
                .map(String::toUpperCase)                 // method reference
                .filter(s -> s.length() >= 3)             // lambda
                .collect(Collectors.groupingBy(String::length)); // grouping

        System.out.println("Grouped by length: " + groupedByLength);

        // Using lambda as comparator with streams to sort
        List<String> sorted = names.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
        System.out.println("Sorted by length desc: " + sorted);

        // Parallel stream to sum lengths (example of parallelism)
        int totalLength = names.parallelStream()
                .filter(Objects::nonNull)
                .mapToInt(String::length)
                .sum();
        System.out.println("Total length via parallel stream: " + totalLength);
    }

    // Demonstrates functional interfaces, lambdas, and default/static
    public static void functionalInterfaceDemo() {
        StringProcessor exclaim = s -> s + "!";
        StringProcessor reverse = s -> new StringBuilder(s).reverse().toString();

        // Compose via default method
        String input = "hello";
        System.out.println("Exclaim twice: " + exclaim.processTwice(input)); // hello!! 
        System.out.println("Reverse then exclaim: " + exclaim.process(reverse.process(input))); // olleh!
        System.out.println("EmptyIfNull static: '" + StringProcessor.emptyIfNull(null) + "'");
    }

    // CompletableFuture demo: async tasks and composition
    public static void completableFutureDemo() throws Exception {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            sleep(500);
            return "Result A";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            sleep(300);
            return "Result B";
        });

        // Combine both when done
        CompletableFuture<String> combined = future1.thenCombine(future2, (a, b) -> a + " & " + b);
        System.out.println("Combined result: " + combined.get());

        // Exception handling and fallback
        CompletableFuture<String> exceptional = CompletableFuture.<String>supplyAsync(() -> {
            throw new RuntimeException("Oops");
        }).exceptionally(ex -> "Recovered from " + ex.getMessage());

        // Since get() throws checked exceptions, either handle or use join()
        System.out.println("Exceptionally recovered: " + exceptional.join());
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ignored) {
        }
    }

    // Date/Time API demo
    public static void dateTimeDemo() {
        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plusWeeks(1);
        LocalTime nowTime = LocalTime.now();
        LocalDateTime meeting = LocalDateTime.of(today, LocalTime.of(14, 30));

        // Format and parse
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM uuuu HH:mm");
        String formatted = meeting.format(formatter);
        System.out.println("Formatted meeting: " + formatted);

        // Duration and Period
        Period untilNextWeek = Period.between(today, nextWeek);
        Duration twoHours = Duration.ofHours(2);
        System.out.println("Days until next week: " + untilNextWeek.getDays());
        System.out.println("Two hours in seconds: " + twoHours.getSeconds());
    }

    // Base64 encoding/decoding
    public static void base64Demo() {
        String original = "Java8 Base64 Example";
        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decoded = new String(decodedBytes);
        System.out.println("Original: " + original);
        System.out.println("Encoded : " + encoded);
        System.out.println("Decoded : " + decoded);
    }

    // Demonstrating StampedLock (optimistic read)
    public static class Point {
        private double x, y;
        private final StampedLock lock = new StampedLock();

        // Write with exclusive lock
        public void move(double deltaX, double deltaY) {
            long stamp = lock.writeLock();
            try {
                x += deltaX;
                y += deltaY;
            } finally {
                lock.unlockWrite(stamp);
            }
        }

        // Read with optimistic locking
        public double distanceFromOrigin() {
            long stamp = lock.tryOptimisticRead();
            double currentX = x;
            double currentY = y;
            if (!lock.validate(stamp)) {
                // Fallback to read lock
                stamp = lock.readLock();
                try {
                    currentX = x;
                    currentY = y;
                } finally {
                    lock.unlockRead(stamp);
                }
            }
            return Math.hypot(currentX, currentY);
        }
    }

    // Example using java.util.function types directly
    public static void functionInterfacesDemo() {
        Function<String, Integer> lengthFunc = String::length; // method reference
        Predicate<String> hasA = s -> s.toLowerCase().contains("a");
        Consumer<String> printer = System.out::println;
        Supplier<String> supplier = () -> "supplied value";

        String test = "Abracadabra";
        if (hasA.test(test)) {
            printer.accept("Length of '" + test + "' is " + lengthFunc.apply(test));
        }
        System.out.println("Supplier gives: " + supplier.get());
    }

    // Main to run all demos
    public static void main(String[] args) throws Exception {
        System.out.println("=== Functional Interface Demo ===");
        functionalInterfaceDemo();
        System.out.println("\n=== Collections & Streams Demo ===");
        collectionsAndStreamsDemo();
        System.out.println("\n=== java.util.function Demo ===");
        functionInterfacesDemo();
        System.out.println("\n=== Date/Time Demo ===");
        dateTimeDemo();
        System.out.println("\n=== Base64 Demo ===");
        base64Demo();
        System.out.println("\n=== CompletableFuture Demo ===");
        completableFutureDemo();
        System.out.println("\n=== StampedLock Demo ===");
        Point p = new Point();
        p.move(3, 4);
        System.out.println("Distance from origin: " + p.distanceFromOrigin());
    }
}

