package com.anmorozov.leetcode.problems.solutions.p0714;

/**
 * <p><b>714.</b> Best Time to Buy and Sell Stock with Transaction Fee.</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>You are given an array {@code prices} where {@code prices[i]} is the price of a given stock on the {@code
     * i}<sup>th</sup> day, and an integer {@code fee} representing a transaction fee.</p>
     *
     * <p>Find the maximum profit you can achieve. You may complete as many transactions as you like, but you need to
     * pay the transaction fee for each transaction.</p>
     *
     * <p><b>Note:</b> You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before
     * you buy again).</p>
     *
     * <p>Constraints:
     * <ui>
     * <li>{@code 1 <= prices.length <= 5 * 104}</li>
     * <li>{@code 1 <= prices[i] < 5 * 104}</li>
     * <li>{@code 0 <= fee < 5 * 104}</li>
     * </ui>
     * </p>
     *
     * @param prices {@code prices[i]} is the price of a given stock on the {@code i}<sup>th</sup> day
     * @param fee representing a transaction fee.
     * @return the maximum profit you can achieve
     */
    int maxProfit(int[] prices, int fee);
}
