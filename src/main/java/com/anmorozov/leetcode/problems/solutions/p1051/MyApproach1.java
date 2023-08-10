package com.anmorozov.leetcode.problems.solutions.p1051;

import java.util.Arrays;

/**
 * My Approach 1 :
 */
public class MyApproach1 implements Solution {

    @Override
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] sortedArray = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sortedArray);

        for (int i = 0; i < heights.length; i++) {
            if (sortedArray[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
