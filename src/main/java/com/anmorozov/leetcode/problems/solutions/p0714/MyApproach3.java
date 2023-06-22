package com.anmorozov.leetcode.problems.solutions.p0714;

public class MyApproach3 implements Solution {

    @Override
    public int maxProfit(int[] prices, int fee) {
        int result = 0;

        int lastMax = 0;
        int lastMin = 0;
        int price;
        boolean justGrow = false;
        int startIndex = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min - fee >= 0) {
                startIndex = i;
                lastMax = prices[i];
                lastMin = min;
                justGrow = true;
                result = result + prices[i] - min - fee;
            }
        }

        for (int i = startIndex + 1; i < prices.length; i++) {
            price = prices[i];
            if (justGrow) {
                if (price >= lastMax) {
                    result = result + price - lastMax;
                    lastMax = price;
                } else {
                    lastMin = price;
                    justGrow = false;
                }
            } else {
                if (price >= lastMax) {
                    if (price - lastMax > price - lastMin - fee) {
                        result = result + price - lastMax;
                        lastMax = price;
                        justGrow = true;
                    } else {
                        result = result + price - lastMin - fee;
                        lastMax = price;
                        justGrow = true;
                    }
                } else {
                    if (price >= lastMin) {
                        if (price - lastMin - fee >= 0) {
                            result = result + price - lastMin - fee;
                            lastMax = price;
                            justGrow = true;
                        }
                    } else {
                        lastMin = price;
                    }
                }
            }
        }
        return result;
    }


}
