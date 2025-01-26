package com.dsa2024.opps.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListCreationExamples {
    public static void main(String[] args) {
        // 1. Default Constructor
        ArrayList<String> defaultConstructorList = new ArrayList<>();
        defaultConstructorList.add("Apple");
        defaultConstructorList.add("Banana");
        System.out.println("Default Constructor: " + defaultConstructorList);

        // 2. Constructor with Initial Capacity
        ArrayList<String> initialCapacityList = new ArrayList<>(20);
        initialCapacityList.add("Apple");
        initialCapacityList.add("Banana");
        System.out.println("Constructor with Initial Capacity: " + initialCapacityList);

        // 3. Constructor with Another Collection
        List<String> initialList = Arrays.asList("Apple", "Banana", "Cherry");
        ArrayList<String> collectionConstructorList = new ArrayList<>(initialList);
        System.out.println("Constructor with Another Collection: " + collectionConstructorList);

        // 4. Using Arrays.asList
        ArrayList<String> arraysAsList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println("Using Arrays.asList: " + arraysAsList);

        // 5. Using Java 8 Streams
        ArrayList<String> streamsList = Stream.of("Apple", "Banana", "Cherry")
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Using Java 8 Streams: " + streamsList);

        // 6. Double Brace Initialization (not recommended)
        ArrayList<String> doubleBraceList = new ArrayList<String>() {
            {
                add("Apple");
                add("Banana");
                add("Cherry");
            }
        };
        System.out.println("Double Brace Initialization: " + doubleBraceList);

        // 7. Using List.of (Java 9+)
        List<String> immutableList = List.of("Apple", "Banana", "Cherry");
        ArrayList<String> listOfList = new ArrayList<>(immutableList);
        System.out.println("Using List.of: " + listOfList);
    }
}
