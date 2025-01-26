package com.dsa2024.opps.Relations;

import java.util.List;
import java.util.ArrayList;

// Teacher class
class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Student class
class Student {
    private String name;
    private List<Teacher> teachers;

    public Student(String name) {
        this.name = name;
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Association {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mr. Smith");
        Teacher teacher2 = new Teacher("Ms. Johnson");

        Student student = new Student("Alice");
        student.addTeacher(teacher1);
        student.addTeacher(teacher2);

        System.out.println(student.getName() + " has teachers:");
        for (Teacher teacher : student.getTeachers()) {
            System.out.println(teacher.getName());
        }
    }
}
