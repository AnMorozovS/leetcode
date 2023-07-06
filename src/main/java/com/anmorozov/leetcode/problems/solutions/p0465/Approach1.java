package com.anmorozov.leetcode.problems.solutions.p0465;

import java.util.List;

/**
 * Approach 1: Backtracking
 */
public class Approach1 implements Solution {

    List<Integer> creditList;

    @Override
    public int minTransfers(int[][] transactions) {
        creditList = getCreditList(transactions);

        int n = creditList.size();
        return clearAllBalancesAtTheRange(0, n);
    }


    private int clearAllBalancesAtTheRange(int cur, int n) {
        while (cur < n && creditList.get(cur) == 0) {
            cur++;
        }

        if (cur == n) {
            return 0;
        }

        int cost = Integer.MAX_VALUE;
        for (int nxt = cur + 1; nxt < n; nxt++) {
            // If nxt is a valid recipient, do the following:
            // 1. add cur's balance to nxt.
            // 2. recursively call clearAllBalancesAtTheRange(cur + 1).
            // 3. remove cur's balance from nxt.
            if (creditList.get(nxt) * creditList.get(cur) < 0) {
                creditList.set(nxt, creditList.get(nxt) + creditList.get(cur));
                cost = Math.min(cost, 1 + clearAllBalancesAtTheRange(cur + 1, n));
                creditList.set(nxt, creditList.get(nxt) - creditList.get(cur));
            }
        }

        return cost;
    }
}
