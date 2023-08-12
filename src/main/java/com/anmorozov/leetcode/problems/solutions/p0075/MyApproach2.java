package com.anmorozov.leetcode.problems.solutions.p0075;

/**
 * My Approach 2 : Counting Sort
 */
public class MyApproach2 implements Solution {

    @Override
    public int[] sortColors(int[] nums) {
        int[] colorCount = new int[3];
        for (int num : nums) {
            colorCount[num] += 1;
        }
        int start = 0;
        for (int i = 0; i < colorCount.length; i++) {
            for (int k = start; k < start + colorCount[i]; k++) {
                nums[k] = i;
            }
            start += colorCount[i];
        }
        return nums;
    }
}
