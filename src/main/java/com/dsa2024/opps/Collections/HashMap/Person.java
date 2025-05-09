package com.dsa2024.opps.Collections.HashMap;

import java.util.Objects;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }

    // Override equals() to compare based on name and age
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;

        // Check if both name and age are the same
        return age == person.age && Objects.equals(name, person.name);
    }

    // Override hashCode() to generate a hash based on name and age
    @Override
    public int hashCode() {
        return Objects.hash(name, age); // Generate hash using name and age
    }
}
