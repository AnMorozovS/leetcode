package com.anmorozov.leetcode.problems.solutions;

public class P121 {

    public int maxProfit(int[] prices) {
        return o1simple(prices);
    }


    private int o2simple(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int currentProfit = prices[j] - prices[i];
                if (currentProfit > profit) {
                    profit = currentProfit;
                }
            }
        }
        return profit;
    }

    private int o1simple(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

}
