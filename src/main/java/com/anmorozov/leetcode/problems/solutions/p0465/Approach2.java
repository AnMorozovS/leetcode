package com.anmorozov.leetcode.problems.solutions.p0465;

import java.util.Arrays;
import java.util.List;

/**
 * Approach 2: Dynamic Programming
 */
public class Approach2 implements Solution {

    List<Integer> creditList;

    @Override
    public int minTransfers(int[][] transactions) {
        creditList = getCreditList(transactions);

        int n = creditList.size();
        int[] memo = new int[1 << n];
        Arrays.fill(memo, -1);
        memo[0] = 0;
        return n - clearAllBalancesAtTheRange((1 << n) - 1, memo);
    }


    private int clearAllBalancesAtTheRange(int totalMask, int[] memo) {
        if (memo[totalMask] != -1) {
            return memo[totalMask];
        }
        int balanceSum = 0;
        int answer = 0;

        // Remove one person at a time in total_mask
        for (int i = 0; i < creditList.size(); i++) {
            int curBit = 1 << i;
            if ((totalMask & curBit) != 0) {
                balanceSum += creditList.get(i);
                answer = Math.max(answer, clearAllBalancesAtTheRange(totalMask ^ curBit, memo));
            }
        }

        // If the total balance of total_mask is 0, increment answer by 1.
        memo[totalMask] = answer + (balanceSum == 0 ? 1 : 0);
        return memo[totalMask];
    }
}
