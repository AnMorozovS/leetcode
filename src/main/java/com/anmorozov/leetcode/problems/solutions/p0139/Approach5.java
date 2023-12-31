package com.anmorozov.leetcode.problems.solutions.p0139;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Approach 5: A Different DP
 */
public class Approach5 implements Solution {

    @Override
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        Set<String> words = new HashSet<>(wordDict);
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && words.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}
