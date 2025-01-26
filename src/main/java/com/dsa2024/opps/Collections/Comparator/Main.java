package com.dsa2024.opps.Collections.Comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "John"));
        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));

        System.out.println("Sorting by Name:");
        Collections.sort(students, new NameComparator());
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("\nSorting by Roll Number:");
        Collections.sort(students, new RollNumberComparator());
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
