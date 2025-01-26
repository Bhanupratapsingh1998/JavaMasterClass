package com.dsa2024.leetcode;

public class buyStock {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0, bestBuy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > bestBuy) {
                maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
            }
            bestBuy = Math.min(bestBuy, prices[i]);
        }
        System.out.println("Best to buy stock is : " + bestBuy);
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Best to sell stock is : " + maxProfit(prices));
    }
}
