package com.dsa2024.stream;

import java.util.*;

public class StreamBasics {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 4, 2, 3, 5, 6, 9, 7, 10, 5);
        List<Integer> evenNums = list1.stream().filter(e -> e % 2 == 0).toList();
        System.out.println("evenNums: " + evenNums);

        List<String> list = Arrays.asList("This", "Tis", " ", "Java", null, "Strean", "Api");
        List<String> toUpperCase = list.stream().filter(Objects::nonNull).map(e -> e.toUpperCase()).toList();
        System.out.println("toUpperCase: " + toUpperCase);

        List<String> removedNullAndEmpty = list.stream().filter(e -> e != null && !e.isBlank()).toList();
        System.out.println("removedNullAndEmpty: " + removedNullAndEmpty);

        long countWords = list.stream().filter(e -> e != null && e.toLowerCase().startsWith("t")).count();
        System.out.println("countWords: " + countWords);

        List<String> empStartEnd = list.stream()
                .filter(e -> e != null && e.toLowerCase().startsWith("t") && e.toLowerCase().endsWith("s")).toList();
        System.out.println("empStartEnd: " + empStartEnd);

        int min = list1.stream().mapToInt(Integer::intValue).min().orElse(0);
        int max = list1.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println("min: " + min + " max: " + max);

        int sum = list1.stream().mapToInt(Integer::intValue).reduce((a, b) -> a + b).orElse(0);
        System.out.println("sum: " + sum);

        int secondLargest = list1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println("secondLargest: " + secondLargest);

        String str = "swiss";
        char ch_non_rep = str.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
                .findFirst()
                .orElse(null);
        System.out.println("First non-repeating char is : " + ch_non_rep);

    }
}
