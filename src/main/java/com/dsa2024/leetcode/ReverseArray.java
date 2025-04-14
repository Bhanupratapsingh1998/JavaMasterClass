package com.dsa2024.leetcode;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reversedArrayWhileLoop(int arr[]) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }

    public static int[] reversedArrayForLoop(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 90, 10, 20, 80, 50, 75 };
        System.out.println("Reversed array is using for loop: " + Arrays.toString(reversedArrayForLoop(arr)));
        System.out.println("Reversed array is using while loop: " + Arrays.toString(reversedArrayWhileLoop(arr)));

    }
}
