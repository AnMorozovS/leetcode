package com.anmorozov.leetcode.problems.solutions.p1216;

public class Approach3 implements Solution {
    @Override
    public boolean isValidPalindrome(String s, int k) {
        int[] memo = new int[s.length()];
        for (int i = s.length() - 2; i >= 0; i--) {
            int prev = 0;
            for (int j = i + 1; j < s.length(); j++) {
                int temp = memo[j];
                if (s.charAt(i) == s.charAt(j)) {
                    memo[j] = prev;
                } else {
                    memo[j] = 1 + Math.min(memo[j], memo[j - 1]);
                }
                prev = temp;
            }
        }
        return memo[s.length() - 1] <= k;
    }
}
