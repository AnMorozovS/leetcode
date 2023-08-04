package com.anmorozov.leetcode.problems.solutions.p0139;

import java.util.Arrays;
import java.util.List;

/**
 * Approach 2: Top-Down Dynamic Programming
 */
public class Approach2 implements Solution {

    private String mainString;
    private List<String> wordDict;
    private int[] memo;

    private boolean dynamicProgramming(int i) {
        if (i < 0) {
            return true;
        }

        if (memo[i] != -1) {
            return memo[i] == 1;
        }

        for (String word : wordDict) {
            // Handle out of bounds case
            if (i - word.length() + 1 < 0) {
                continue;
            }

            if (mainString.substring(i - word.length() + 1, i + 1).equals(word) && dynamicProgramming(
                    i - word.length())) {
                memo[i] = 1;
                return true;
            }
        }

        memo[i] = 0;
        return false;
    }

    @Override
    public boolean wordBreak(String s, List<String> wordDict) {
        this.mainString = s;
        this.wordDict = wordDict;
        this.memo = new int[s.length()];
        Arrays.fill(this.memo, -1);
        return dynamicProgramming(s.length() - 1);
    }
}
