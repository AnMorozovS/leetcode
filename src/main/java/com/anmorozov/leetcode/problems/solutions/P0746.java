package com.anmorozov.leetcode.problems.solutions;

import java.util.HashMap;
import java.util.Map;

public class P0746 {

    final Map<Integer, Integer> integerHashMap = new HashMap<>();

    public int minCostClimbingStairs(int[] cost) {
        if (cost.length <= 1) {
            return 0;
        } else {
            return minCostClimbingStairs(-1, cost);
        }
    }

    public int minCostClimbingStairs(int index, int[] cost) {
        int currentCost = 0;
        if (index >= 0 && index < cost.length) {
            currentCost = cost[index];
        }
        if (index + 2 >= cost.length) {
            return currentCost;
        }
        if (index + 1 == cost.length) {
            return currentCost;
        }
        int cost1;
        if (!integerHashMap.containsKey(index + 1)) {
            cost1 = minCostClimbingStairs(index + 1, cost);
            integerHashMap.put(index + 1, cost1);
        } else {
            cost1 = integerHashMap.get(index + 1);
        }
        int cost2;
        if (!integerHashMap.containsKey(index + 2)) {
            cost2 = minCostClimbingStairs(index + 2, cost);
            integerHashMap.put(index + 2, cost2);
        } else {
            cost2 = integerHashMap.get(index + 2);
        }

        if (cost1 >= cost2) {
            return currentCost + cost2;
        } else {
            return currentCost + cost1;
        }
    }
}
