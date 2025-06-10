package com.dsa2024.leetcode.basics_foundations;

public class MinAnd2ndMin {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 9, 11, 23 };
        int[] result = findMinAndSecondMin(arr);
        System.out.println("Minimum: " + result[0]);
        System.out.println("Second Minimum: " + result[1]);
    }

    private static int[] findMinAndSecondMin(int[] arr) {
        int n = arr.length;
        if (n < 2)
            return new int[] { -1, -1 };

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num > min && num < secondMin) {
                secondMin = num;
            }
        }

        // If secondMin was not updated
        if (secondMin == Integer.MAX_VALUE)
            return new int[] { -1, -1 };

        return new int[] { min, secondMin };
    }
}
