package com.anmorozov.leetcode.problems.solutions;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 2448. Minimum Cost to Make Array Equal.
 */
public class P2448 {

    private static long getAnswer(int n, int[][] numsAndCost, long[] prefixCost) {
        long totalCost = 0L;
        for (int i = 1; i < n; ++i) {
            totalCost = totalCost + (long) numsAndCost[i][1] * (numsAndCost[i][0] - numsAndCost[0][0]);
        }
        long answer = totalCost;

        for (int i = 1; i < n; ++i) {
            int gap = numsAndCost[i][0] - numsAndCost[i - 1][0];
            totalCost = totalCost + prefixCost[i - 1] * gap;
            totalCost = totalCost - (prefixCost[n - 1] - prefixCost[i - 1]) * gap;
            answer = Math.min(answer, totalCost);
        }
        return answer;
    }

    /**
     * <p>You are given two <b>0-indexed</b> arrays {@code nums} and {@code cost} consisting each of {@code n}
     * <b>positive</b> integers.</p>
     *
     * <p>You can do the following operation <b>any</b> number of times:</p>
     * <ul>
     * <li>Increase or decrease <b>any</b> element of the array {@code nums} by {@code 1}.</li>
     * </ul>
     * <p>The cost of doing one operation on the {@code i}<sup>th</sup> element is  {@code cost[i]}.</p>
     *
     * <p>Constraints:</p>
     * <ul>
     * <li>{@code n == nums.length == cost.length}</li>
     * <li>{@code 1 <= n <= 105}</li>
     * <li>{@code 1 <= nums[i], cost[i] <= 106}</li>
     * </ul>
     *
     * @param nums incoming array to change
     * @param cost array of cost to increase {@code nums[i]} by {@code 1}
     * @return <i>the <b>minimum</b> total cost such that all the elements of the array {@code nums} become
     * <b>equal</b></i>.
     */
    public long minCost(int[] nums, int[] cost) {

        int n = nums.length;
        int[][] numsAndCost = new int[n][2];
        for (int i = 0; i < n; ++i) {
            numsAndCost[i][0] = nums[i];
            numsAndCost[i][1] = cost[i];
        }
        Arrays.sort(numsAndCost, Comparator.comparingInt(a -> a[0]));

        long[] prefixCost = new long[n];
        prefixCost[0] = numsAndCost[0][1];
        for (int i = 1; i < n; ++i) {
            prefixCost[i] = numsAndCost[i][1] + prefixCost[i - 1];
        }

        return getAnswer(n, numsAndCost, prefixCost);
    }

}
