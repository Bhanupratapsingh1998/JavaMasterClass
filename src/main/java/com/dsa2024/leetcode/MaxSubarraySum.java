package com.dsa2024.leetcode;

import java.util.ArrayList; 

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("Maximum subarray sum is: " + maxSubArray(nums));
        System.out.println("-------------------------------");
        maxSubArrayWithOutKadane(nums);
    }

    //Maximum Subarray Sum (Kadane's Algorithm)
    private static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int index = 1; index < nums.length; index++) {
            currentSum = Math.max(nums[index], currentSum + nums[index]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
     //Maximum Subarray Sum (Without Kadane's Algorithm)
     private static void maxSubArrayWithOutKadane(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        int start = 0, end = 0, tempStart = 0;
        ArrayList<Integer> maxSubArrayList = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                tempStart = i;
            }else{
                currentSum = currentSum + nums[i];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        for (int index = start; index <= end; index++) {
            maxSubArrayList.add(nums[index]);
        }
        System.out.println(maxSubArrayList);
        System.out.println("Max subaaray sum : "+maxSum);
    }

}
