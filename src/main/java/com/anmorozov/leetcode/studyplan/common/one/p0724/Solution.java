package com.anmorozov.leetcode.studyplan.common.one.p0724;

class Solution {

    public int pivotIndex(int[] nums) {

        int[] rightSums = new int[nums.length];
        int rightSum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            rightSums[i] = rightSum;
            rightSum = rightSum + nums[i];
        }
        int[] leftSums = new int[nums.length];
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSums[i] = leftSum;
            leftSum = leftSum + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSums[i] == rightSums[i]) {
                return i;
            }
        }
        return -1;
    }
}
