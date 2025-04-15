package com.dsa2024.leetcode;

import java.util.Arrays;

public class ProductArray {
    private static int[] productArray(int[] numbers, int n) {

        int[] left = new int[n];
        int[] right = new int[n];
        int[] output = new int[n];

        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * numbers[i - 1];
        }

        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * numbers[i + 1];
        }

        for (int i = 0; i < n; i++) {
            output[i] = left[i] * right[i];
        }
        return output;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4 };
        int n = numbers.length;
        System.out.println(Arrays.toString(productArray(numbers, n))); // [24, 12, 8, 6]
    }
}
