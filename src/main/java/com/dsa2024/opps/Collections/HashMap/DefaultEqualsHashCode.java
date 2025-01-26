package com.dsa2024.opps.Collections.HashMap;

import java.util.HashSet;
import java.util.Objects;

class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class DefaultEqualsHashCode {
    public static void main(String[] args) {
        // Create two Person objects with the same data
        Student student1 = new Student("John", 25);
        Student student2 = new Student("John", 25);

        // Compare using equals()
        System.out.println("person1 equals person2: " + student1.equals(student2)); // false

        // HashSet behavior
        HashSet<Student> set = new HashSet<>();
        set.add(student1);
        set.add(student2);

        System.out.println("HashSet contents: " + set); // Both objects will be stored
    }
}
