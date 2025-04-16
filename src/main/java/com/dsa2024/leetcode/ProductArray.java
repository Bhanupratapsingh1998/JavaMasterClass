package com.dsa2024.leetcode;

import java.util.Arrays;

public class ProductArray {
    private static int[] productArray(int[] numbers, int n) {
        int[] result = new int[n];

        // Step 1: Calculate prefix product for each index
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * numbers[i - 1];
        }

        // Step 2: Multiply with suffix product  1,1,2,6
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffixProduct;
            suffixProduct = suffixProduct * numbers[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4 };
        int n = numbers.length;
        System.out.println(Arrays.toString(productArray(numbers, n))); // [24, 12, 8, 6]
    }
}
