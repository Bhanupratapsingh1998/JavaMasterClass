package com.dsa2024.opps.Collections.Comparable;

public class ComparableDemo {
    public static void main(String[] args) {
        System.out.println("A".compareTo("Z")); // -25
        System.out.println("Z".compareTo("K")); // 15
        System.out.println("Z".compareTo("Z")); // 0
        // System.out.println("Z".compareTo(null)); // RE:
        // java.lang.NullPointerException
    }
}
