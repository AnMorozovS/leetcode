package com.anmorozov.leetcode.problems.solutions;

import java.util.HashMap;
import java.util.Map;

public class P0070 {

    private final Map<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        if (!map.containsKey(n - 1)) {
            map.put(n - 1, climbStairs(n - 1));
        }
        if (!map.containsKey(n - 2)) {
            map.put(n - 2, climbStairs(n - 2));
        }
        return map.get(n - 1) + map.get(n - 2);
    }
}
