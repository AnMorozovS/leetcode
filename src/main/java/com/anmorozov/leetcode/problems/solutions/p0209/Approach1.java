package com.anmorozov.leetcode.problems.solutions.p0209;

/**
 * Approach 1: Sliding Window
 */
public class Approach1 implements Solution {

    @Override
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right;
        int sumOfCurrentWindow = 0;
        int res = Integer.MAX_VALUE;

        for (right = 0; right < nums.length; right++) {
            sumOfCurrentWindow += nums[right];

            while (sumOfCurrentWindow >= target) {
                res = Math.min(res, right - left + 1);
                sumOfCurrentWindow -= nums[left++];
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
