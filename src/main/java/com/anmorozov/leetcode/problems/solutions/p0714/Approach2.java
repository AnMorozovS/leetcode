package com.anmorozov.leetcode.problems.solutions.p0714;

public class Approach2 implements Solution {

    @Override
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int free = 0;
        int hold = -prices[0];

        for (int i = 1; i < n; i++) {
            int tmp = hold;
            hold = Math.max(hold, free - prices[i]);
            free = Math.max(free, tmp + prices[i] - fee);
        }

        return free;
    }
}
