package com.anmorozov.leetcode.problems.solutions.p0518;

/**
 * <p><strong>518.</strong> Coin Change II.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>You are given an integer array {@code coins} representing coins of different denominations and an integer
     * {@code amount} representing a total amount of money.</p>
     *
     * <p>Return <em>the number of combinations that make up that amount</em>. If that amount of money cannot be made
     * up by any combination of the coins, return {@code 0}.</p>
     *
     * <p>You may assume that you have an infinite number of each kind of coin.</p>
     *
     * <p>The answer is <strong>guaranteed</strong> to fit into a signed <strong>32-bit</strong> integer.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= coins.length <= 300}</li>
     * 	<li>{@code 1 <= coins[i] <= 5000}</li>
     * 	<li>All the values of {@code coins} are <strong>unique</strong>.</li>
     * 	<li>{@code 0 <= amount <= 5000}</li>
     * </ul>
     *
     * @param amount a total amount of money
     * @param coins coins of different denominations
     * @return <em>the number of combinations that make up that amount</em>
     */
    int change(int amount, int[] coins);
}
