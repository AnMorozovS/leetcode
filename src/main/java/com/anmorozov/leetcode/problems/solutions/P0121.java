package com.anmorozov.leetcode.problems.solutions;

public class P0121 {

    public int maxProfit(int[] prices) {
        return o1simple(prices);
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
