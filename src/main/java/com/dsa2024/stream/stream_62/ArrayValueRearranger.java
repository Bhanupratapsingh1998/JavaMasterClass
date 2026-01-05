package com.dsa2024.stream.stream_62;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ArrayValueRearranger {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(ArrayValueRearranger.formHighestValue(arr));
        System.out.println(ArrayValueRearranger.formLowestValue(arr));
    }

    private static String formLowestValue(int[] arr) {
        return Arrays.stream(arr).sorted().mapToObj(String::valueOf).collect(Collectors.joining());
    }

    private static String formHighestValue(int[] arr) {
        return Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).map(String::valueOf)
                .collect(Collectors.joining());
    }
}
