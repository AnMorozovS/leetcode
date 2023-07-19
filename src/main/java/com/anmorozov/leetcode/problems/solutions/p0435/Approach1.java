package com.anmorozov.leetcode.problems.solutions.p0435;

import java.util.Arrays;
import java.util.Comparator;

public class Approach1 implements Solution {

    @Override
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int ans = 0;
        int k = Integer.MIN_VALUE;

        for (int[] interval : intervals) {
            int x = interval[0];
            int y = interval[1];
            if (x >= k) {
                k = y;
            } else {
                ans++;
            }
        }
        return ans;
    }
}
