package com.dsa2024.javaqa.interviews_qa;

import java.util.stream.IntStream;

public class LinearSearchExample {

    public static int findIndex(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }

    public static int findIndexWithStream(int[] arr, int ele) {
        int index = IntStream.range(0, arr.length)
                .filter(i -> arr[i] == ele)
                .findFirst()
                .orElse(-1);
        return index;

    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 3 };
        int ele = 2;

        int result = findIndexWithStream(arr, ele);
        System.out.println(result);
    }
}
