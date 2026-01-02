package com.dsa2024.stream.stream_62;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordOccurrenceCounter {
    public static void main(String[] args) {
        String str = "I am the java developer and i am java stream api";
        Map<String, Long> result = countWordOccurrences(str);
        System.out.println(result);
    }

    private static Map<String, Long> countWordOccurrences(String str) {
        return Arrays.stream(str.split(" ")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
