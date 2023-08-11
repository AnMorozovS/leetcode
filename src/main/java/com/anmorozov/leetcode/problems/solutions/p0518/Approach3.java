package com.anmorozov.leetcode.problems.solutions.p0518;

/**
 * Approach 3: Dynamic Programming with Space Optimization
 */
public class Approach3 implements Solution {

    @Override
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }

        return dp[amount];
    }
}
