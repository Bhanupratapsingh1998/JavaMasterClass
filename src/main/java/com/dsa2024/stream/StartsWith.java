package com.dsa2024.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * InnerfindFirst
 */
class Student {
    private int id;
    private String fname;
    private String lastname;

    public Student() {
        super();
    }

    public Student(int id, String fname, String lastname) {
        this.id = id;
        this.fname = fname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}

public class StartsWith {
    public static void main(String[] args) {

        Student st = new Student();
        st.setId(1);
        st.setFname("Bhanu");
        st.setLastname("Pratap");

        Student st1 = new Student(2, "Deepak", "Yadav");
        Student st2 = new Student(2, "Deepansh", "Kumar");

        List<Student> students = new ArrayList<>();
        students.add(st);
        students.add(st1);
        students.add(st2);

        System.out.println("Before filtering : ");
        for (Student student : students) {
            System.out.println(student.getFname());
        }

        List<Student> data = students.stream().filter(e -> e.getFname().startsWith("D") && e.getFname().endsWith("h"))
                .collect(Collectors.toList());
        System.out.println("After  filtering starts with D letter : ");
        for (Student student : data) {
            System.out.println(student.getFname());
        }

    }
}
