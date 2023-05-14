package com.anmorozov.leetcode.studyplan.common.one.p0724;

import java.util.Arrays;

class Solution {

    public int pivotIndex(int[] nums) {

        int[] rightSums = new int[nums.length];
        int rightSum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            rightSums[i] = rightSum;
            rightSum = rightSum + nums[i];
        }
        System.out.println(Arrays.toString(rightSums));
        int[] leftSums = new int[nums.length];
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSums[i] = leftSum;
            leftSum = leftSum + nums[i];
        }
        System.out.println(Arrays.toString(leftSums));
        for (int i = 0; i < nums.length; i++) {
            if (leftSums[i] == rightSums[i]) {
                return i;
            }
        }
        return -1;
    }
}
