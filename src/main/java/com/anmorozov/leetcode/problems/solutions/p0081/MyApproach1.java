package com.anmorozov.leetcode.problems.solutions.p0081;

public class MyApproach1 implements Solution {

    @Override
    public boolean search(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
