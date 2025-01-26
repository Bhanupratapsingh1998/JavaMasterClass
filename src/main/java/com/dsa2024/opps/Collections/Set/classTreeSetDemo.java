package com.dsa2024.opps.Collections.Set;

import java.util.TreeSet;

public class classTreeSetDemo {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add("A");
        t.add("a");
        t.add("B");
        t.add("Z");
        t.add("L");
        t.add(new Integer(10)); // RE: Exception in thread "main" java.lang.ClassCastException: java.lang.String
                                // cannot be cast to java.lang.Integer
        t.add(null);// RE: Exception in thread "main" java.lang.NullPointerException
        System.out.println(t); // [A, B, L, Z, a]
    }
}