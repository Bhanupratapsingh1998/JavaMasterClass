package com.dsa2024.opps.Collections.Comparator;

import java.util.Comparator;

class RollNumberComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollNumber(), s2.getRollNumber());
    }
}
