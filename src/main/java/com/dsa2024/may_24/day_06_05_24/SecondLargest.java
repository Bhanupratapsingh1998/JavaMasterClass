package com.dsa2024.may_24.day_06_05_24;

import java.util.Arrays;

public class SecondLargest {
    static private int[] getElements(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return new int[] { -1, -1 };
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < n; i++) {
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }
        for (i = 0; i < n; i++) {
            if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
            if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        // Return an array with second smallest and second largest elements
        return new int[] { second_small, second_large };
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 7, 5 };
        int[] result = getElements(arr, arr.length);
        System.out.println("Second smallest and Second largest is " + Arrays.toString(result));
    }
}
