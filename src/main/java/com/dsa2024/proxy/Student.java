package com.dsa2024.proxy;

public class Student implements DialySession {
    private Attendance attendance;

    public Student(Attendance attendance) {
        this.attendance = attendance;
    }

    @Override
    public void attendLession() {
        System.out.println("Attending the session...");
    }

    public void attendLession(Integer id) {
        System.out.println("Student with id " + id + "attending");
    }

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

}
