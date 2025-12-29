package com.dsa2024.stream.stream_62;

import java.util.Arrays;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String str = "abbacdde";
        removeDuplicateCharacters(str);
    }

    private static void removeDuplicateCharacters(String str) {
        Arrays.stream(str.split("")).distinct().forEach(System.out::print);
    }
}
