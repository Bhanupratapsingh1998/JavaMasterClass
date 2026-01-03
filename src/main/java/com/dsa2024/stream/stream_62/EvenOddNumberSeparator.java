package com.dsa2024.stream.stream_62;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumberSeparator {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        List<List<Integer>> reList = partitionEvenAndOdd(arr);
        System.out.println(reList);
    }

    private static List<List<Integer>> partitionEvenAndOdd(int[] arr) {
        return Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(x -> x % 2 == 0, Collectors.toList()))
                .entrySet().stream().map(x -> x.getValue()).collect(Collectors.toList());
    }
}
