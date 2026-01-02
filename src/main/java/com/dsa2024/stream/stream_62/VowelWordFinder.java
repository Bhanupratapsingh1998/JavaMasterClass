package com.dsa2024.stream.stream_62;

import java.util.Arrays;
import java.util.List;

public class VowelWordFinder {
    public static void main(String[] args) {
        String str = "I am the java developer and i am java stream api";
        List<String> result = findWordsWithExactVowels(str);
        System.out.println(result);
    }

    private static List<String> findWordsWithExactVowels(String str) {
        return Arrays.stream(str.split(" ")).filter(s -> s.replaceAll("[^aeiouAEIOU]", "").length() == 2).toList();
    }
}
