package com.anmorozov.leetcode.problems.solutions.p0920;

public class MyApproach1 implements Solution {

    private static final int MODULE = 1_000_000_007;

    @Override
    public int numMusicPlaylists(int n, int goal, int k) {
        // Initialize the DP table
        long[][] dp = new long[goal + 1][n + 1];
        dp[0][0] = 1;

        for (int i = 1; i <= goal; i++) {
            for (int j = 1; j <= Math.min(i, n); j++) {
                // The i-th song is a new song
                dp[i][j] = dp[i - 1][j - 1] * (n - j + 1) % MODULE;
                // The i-th song is a song we have played before
                if (j > k) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j] * (j - k)) % MODULE;
                }
            }
        }
        return (int) dp[goal][n];
    }
}
