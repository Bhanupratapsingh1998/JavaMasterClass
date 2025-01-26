package com.dsa2024.leetcode;

import java.util.Arrays;

public class secondLargest {
    public static int findSecondLargestNum(int arr[]) {
        int largest = arr[0];
        int secondLargest = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && largest != secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    // Using this in Stream API
    public static int findSecondLargestNumWithStream(int[] arr) {
        return Arrays.stream(arr)
                .boxed() // Convert int to Integer
                .distinct()
                .sorted((a, b) -> b - a) // Sort in descending order
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Array must contain at least two unique numbers"));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 4, 9, 11, 23 };
        // int result = findSecondLargestNum(arr);
        int result = findSecondLargestNumWithStream(arr);
        System.out.println("The second largest number is : " + result);
    }
}
