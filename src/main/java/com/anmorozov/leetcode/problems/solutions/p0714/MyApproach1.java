package com.anmorozov.leetcode.problems.solutions.p0714;

import java.util.HashMap;
import java.util.Map;

public class MyApproach1 implements Solution {

    private int[] prices;
    private int transactionFee;
    private Map<Integer, Map<Integer, Integer>> cash;

    @Override
    public int maxProfit(int[] prices, int fee) {
        this.prices = prices;
        this.transactionFee = fee;
        this.cash = new HashMap<>();
        return maxProfit(0, 0);
    }

    public int useCash(int day, int boughtPrice) {
        Map<Integer, Integer> currentMap = this.cash.computeIfAbsent(day, x -> new HashMap<>());
        if (!currentMap.containsKey(boughtPrice)) {
            int result = maxProfit(day, boughtPrice);
            currentMap.put(boughtPrice, result);
        }
        return currentMap.get(boughtPrice);
    }

    public int maxProfit(int day, Integer boughtPrice) {
        int currentProfit = prices[day] - boughtPrice - transactionFee;
        if (day == prices.length - 1) {
            if (boughtPrice == 0) {
                return 0;
            } else {
                return currentProfit;
            }
        }
        int sum1 = useCash(day + 1, boughtPrice);
        int sum2 = 0;
        if (boughtPrice > 0) {
            if (currentProfit > 0) {
                sum2 = currentProfit + useCash(day + 1, 0);
            }
        } else {
            sum2 = useCash(day + 1, prices[day]);
        }
        return Math.max(sum1, sum2);
    }

}
