package com.anmorozov.leetcode.problems.solutions.p0139;

import java.util.List;

/**
 * Approach 3: Bottom-Up Dynamic Programming
 */
public class Approach3 implements Solution {

    @Override
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (String word : wordDict) {
                // Handle out of bounds case
                if (i < word.length() - 1) {
                    continue;
                }

                if (i == word.length() - 1 || dp[i - word.length()]) {
                    if (s.substring(i - word.length() + 1, i + 1).equals(word)) {
                        dp[i] = true;
                        break;
                    }
                }
            }
        }

        return dp[s.length() - 1];
    }
}
