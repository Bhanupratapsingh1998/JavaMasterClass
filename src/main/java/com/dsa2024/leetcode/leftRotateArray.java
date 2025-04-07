package com.dsa2024.leetcode;

import java.util.Arrays;

public class leftRotateArray {
    /* Left Rotate the Array by One */
    static void rotateByOne(int arr[], int n) {
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
        System.out.println(Arrays.toString(arr));
    }

    /* Left Rotate the Array by kth O(n2) */
    public static void rotate(int arr[], int d, int n) {
        int p = 1;
        while (p <= d) {
            int last = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = last;
            p++;
        }
        System.out.println(Arrays.toString(arr));
    }

    /* Left Rotate the Array by kth O(n) */
    static void rotateArr(int arr[], int d, int n) {
        // To handle cases where d > n
        d = d % n;

        // Create a temporary array to store the first 'd' elements
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Shift the remaining elements to the left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Copy the elements from the temporary array to the end of the original array
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int N = arr.length;
        int d = 3;
        rotateArr(arr, d, N);
    }
}
