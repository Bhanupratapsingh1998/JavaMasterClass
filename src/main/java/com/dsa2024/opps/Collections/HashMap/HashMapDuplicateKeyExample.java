package com.dsa2024.opps.Collections.HashMap;

import java.util.HashMap;

public class HashMapDuplicateKeyExample {
    public static void main(String[] args) {
        // Create a HashMap with Person as the key
        HashMap<Person, String> map = new HashMap<>();

        // Add entries to the map
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Bob", 25);
        Person p3 = new Person("Alice", 30);

        map.put(p1, "Software Engineer");
        map.put(p2, "Data Scientist");

        // Attempt to add p3, which has the same name and age as p1
        map.put(p3, "Architect");

        // Print the map contents
        System.out.println(map);

        // Check if p1 and p3 are treated as different keys
        System.out.println("Get p1: " + map.get(p1));
        System.out.println("Get p3: " + map.get(p3));

        map.forEach((person, profession) -> System.out.println(person + " -> " + profession));
    }
}
