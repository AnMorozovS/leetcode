package com.anmorozov.leetcode.problems.solutions.p0137;

import java.util.Arrays;

/**
 * Approach 1: Sorting
 */
public class Approach1 implements Solution {

    @Override
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 3) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
