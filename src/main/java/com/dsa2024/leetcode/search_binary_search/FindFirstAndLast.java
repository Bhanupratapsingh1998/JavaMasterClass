package com.dsa2024.leetcode.search_binary_search;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/?envType=study-plan&id=level-1
public class FindFirstAndLast {
    public static int[] searchRange(int nums[], int target) {
        int[] ans = { -1, -1 };
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    // Time complexity: O(log n)
    // Space complexity: O(1)
    // Binary search is used to find the first and last position of the target in a
    // sorted array.
    private static int search(int[] nums, int target, boolean findtargetIndex) {
        int ans = -1;
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findtargetIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return ans;
    }

    // turn the first and last position of the target in a sorted array using two
    // pointer approach
    // Time complexity: O(n)
    // Space complexity: O(1)
    public static int[] searchRangeTwoPointer(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            if (nums[left] == target && ans[0] == -1) {
                ans[0] = left;
            }
            if (nums[right] == target && ans[1] == -1) {
                ans[1] = right;
            }
            if (ans[0] != -1 && ans[1] != -1) {
                break;
            }
            if (ans[0] == -1) {
                left++;
            }
            if (ans[1] == -1) {
                right--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int results[] = searchRange(nums, target);
        // int results[] = searchRangeTwoPointer(nums, target);
        System.out.println(Arrays.toString(results));
    }
}