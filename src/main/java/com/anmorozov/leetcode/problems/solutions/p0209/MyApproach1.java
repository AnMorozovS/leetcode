package com.anmorozov.leetcode.problems.solutions.p0209;

public class MyApproach1 implements Solution {

    @Override
    public int minSubArrayLen(int target, int[] nums) {
        int rightWindowIndex = 0;
        int windowSum = 0;
        int minSize = Integer.MAX_VALUE;
        for (int leftWindowIndex = 0; leftWindowIndex < nums.length; leftWindowIndex++) {
            while (windowSum < target && rightWindowIndex < nums.length) {
                windowSum += nums[rightWindowIndex];
                rightWindowIndex = rightWindowIndex + 1;

            }
            if (windowSum >= target && minSize > rightWindowIndex - leftWindowIndex) {
                minSize = rightWindowIndex - leftWindowIndex;
            }
            windowSum -= nums[leftWindowIndex];
        }
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }
}
