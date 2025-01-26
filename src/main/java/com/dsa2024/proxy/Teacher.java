package com.dsa2024.proxy;

import java.util.Date;

public class Teacher {
    public static void main(String[] args) {
        // Student student = new Student(new Attendance(new Date(), true));// without
        // proxy
        Student student = new StudentProxy(new Attendance(new Date(), false));
        student.attendLession();
    }
}
