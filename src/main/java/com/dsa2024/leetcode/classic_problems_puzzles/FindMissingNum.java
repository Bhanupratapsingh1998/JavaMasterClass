package com.dsa2024.leetcode.classic_problems_puzzles;

public class FindMissingNum {
    static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6 };
        int k = findMissingNumber(arr, 6);
        System.out.println("Find the missing number is : " + k);
    }
}
