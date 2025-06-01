package com.dsa2024.leetcode.basics_foundations;

import java.util.Arrays;

public class SecondLargest {
    public static int findSecondLargestNum(int arr[]) {
        if (arr == null || arr.length < 3) {
            throw new IllegalArgumentException("Array must contain at least three elements");
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if (num > thirdLargest && num < secondLargest) {
                thirdLargest = num;
            }
        }

        if (thirdLargest == Integer.MIN_VALUE) {
            throw new RuntimeException("No distinct third largest number found");
        }

        return largest;
    }

    // Using this in Stream API
    public static int findSecondLargestNumWithStream(int[] arr) {
        return Arrays.stream(arr)
                .boxed() // Convert int to Integer
                .distinct()
                // .sorted(Comparator.reverseOrder())
                .sorted((a, b) -> b - a) // Sort in descending order
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Array must contain at least two unique numbers"));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2 };
        int result = findSecondLargestNum(arr);
        // int result = findSecondLargestNumWithStream(arr);
        System.out.println("The second largest number is : " + result);
    }
}
