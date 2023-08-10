package com.anmorozov.leetcode.problems.solutions.p0075;

/**
 * My Approach 1 : Selection Sort
 */
public class MyApproach1 implements Solution {

    @Override
    public int[] sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] < nums[i]) {
                        int tmp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = tmp;
                        i--;
                        break;
                    }
                }
            }
        }
        return nums;
    }
}
