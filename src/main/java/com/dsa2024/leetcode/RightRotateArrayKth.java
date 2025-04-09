package com.dsa2024.leetcode;

public class RightRotateArrayKth {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 3;
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);  // 5 4 3 2 1
        reverse(arr, 0, k - 1);  // 3 4 5 2 1 
        reverse(arr, k, n - 1); // 3 4 5 1 2
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start++;
            end--;
        }
    }
}
