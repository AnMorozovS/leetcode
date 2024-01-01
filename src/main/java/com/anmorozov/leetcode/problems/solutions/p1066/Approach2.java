package com.anmorozov.leetcode.problems.solutions.p1066;

import java.util.Arrays;

/**
 * Approach 2: Top-Down Dynamic Programming + BitMasking
 */
public class Approach2 implements Solution {

    private final int[] memo = new int[1024];

    private int minimumDistanceSum(int[][] workers, int[][] bikes, int workerIndex, int mask) {
        if (workerIndex >= workers.length) {
            return 0;
        }
        if (memo[mask] != -1) {
            return memo[mask];
        }

        int smallestDistanceSum = Integer.MAX_VALUE;
        for (int bikeIndex = 0; bikeIndex < bikes.length; bikeIndex++) {
            if ((mask & (1 << bikeIndex)) == 0) {
                smallestDistanceSum = Math.min(smallestDistanceSum, findDistance(workers[workerIndex], bikes[bikeIndex]) + minimumDistanceSum(workers, bikes, workerIndex + 1, mask | (1 << bikeIndex)));
            }
        }
        return memo[mask] = smallestDistanceSum;
    }

    @Override
    public int assignBikes(int[][] workers, int[][] bikes) {
        Arrays.fill(memo, -1);
        return minimumDistanceSum(workers, bikes, 0, 0);
    }
}
