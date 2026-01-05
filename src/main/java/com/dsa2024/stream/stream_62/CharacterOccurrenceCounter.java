package com.dsa2024.stream.stream_62;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterOccurrenceCounter {
    public static void main(String[] args) {
        String str = "JavaDevelopers";
        Map<String, Long> result = countCharacterOccurrences(str);
        System.out.println(result);
    }

    private static Map<String, Long> countCharacterOccurrences(String str) {
        return Arrays.stream(str.split("")).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
    }
}
