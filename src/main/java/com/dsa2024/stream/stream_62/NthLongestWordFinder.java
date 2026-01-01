package com.dsa2024.stream.stream_62;

import java.util.Arrays;
import java.util.Comparator;

public class NthLongestWordFinder {
    public static void main(String[] args) {
        String str = "I am the java developer";
        System.out.println(findSecondLongestWord(str));
    }

    private static String findSecondLongestWord(String str) {
        return Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst()
                .get();
    }
}
