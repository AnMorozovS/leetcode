package com.anmorozov.leetcode.problems.solutions.p0688;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * My Approach 1: Recursion with cache
 */
public class MyApproach1 implements Solution {

    private int deskSize;

    private Map<Integer, Map<String, BigDecimal>> cache;

    @Override
    public double knightProbability(int n, int k, int row, int column) {
        this.cache = new HashMap<>();
        this.deskSize = n;
        BigDecimal result = useCache(k, row, column);
        return result.doubleValue();
    }

    private BigDecimal useCache(int k, int row, int column) {
        Map<String, BigDecimal> subMap = cache.computeIfAbsent(k, HashMap::new);
        String hash = "" + row + "," + column;
        if (!subMap.containsKey(hash)) {
            BigDecimal result = knightMove(k, row, column);
            subMap.put(hash, result);
        }
        return subMap.get(hash);

    }

    private BigDecimal knightMove(int k, int row, int column) {
        if (row < 0 || row > this.deskSize - 1 || column < 0 || column > this.deskSize - 1) {
            return BigDecimal.ZERO;
        }
        if (k == 0) {
            return BigDecimal.ONE;
        }

        BigDecimal result = BigDecimal.ZERO;
        for (int[] possibleMove : DIRECTIONS) {
            result = result.add(useCache(k - 1, possibleMove[0] + row, possibleMove[1] + column));
        }
        //noinspection BigDecimalMethodWithoutRoundingCalled
        result = result.divide(BigDecimal.valueOf(8));
        return result;
    }
}
