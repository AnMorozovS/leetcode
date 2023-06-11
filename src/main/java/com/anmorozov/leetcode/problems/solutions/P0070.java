package com.anmorozov.leetcode.problems.solutions;

import java.util.HashMap;
import java.util.Map;

public class P0070 {

    private final Map<Integer, Integer> climbStairsCash = new HashMap<>();

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        if (!climbStairsCash.containsKey(n - 1)) {
            climbStairsCash.put(n - 1, climbStairs(n - 1));
        }
        if (!climbStairsCash.containsKey(n - 2)) {
            climbStairsCash.put(n - 2, climbStairs(n - 2));
        }
        return climbStairsCash.get(n - 1) + climbStairsCash.get(n - 2);
    }
}
