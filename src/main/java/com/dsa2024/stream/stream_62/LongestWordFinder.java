package com.dsa2024.stream.stream_62;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWordFinder {
    public static void main(String[] args) {
        String str = "I am the java developer";
        System.out.println(findLongestWord(str));
    }

    private static String findLongestWord(String str) {
        return Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
    }
}
