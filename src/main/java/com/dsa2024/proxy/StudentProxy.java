package com.dsa2024.proxy;

public class StudentProxy extends Student {

    public StudentProxy(Attendance attendance) {
        super(attendance);
    }

    @Override
    public void attendLession() {
        if (!super.getAttendance().isPresent()) {
            throw new RuntimeException("Student is not present and can't attend the lession.");
        }
        super.attendLession();
    }

}
