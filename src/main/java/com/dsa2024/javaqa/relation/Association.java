package com.dsa2024.javaqa.relation;
class Teacher {
    private final String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void teach() {
        System.out.println(name + " is teaching.");
    }
}

class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public void study() {
        System.out.println(name + " is studying.");
    }
}

public class Association {
    public static void main(String[] args) {
        // Creating Teacher and Student objects
        Teacher teacher = new Teacher("Mr. Bhanu");
        Student student = new Student("John");

        // Demonstrating the association
        teacher.teach();  // Mr. Smith is teaching.
        student.study();  // John is studying.
    }
}
