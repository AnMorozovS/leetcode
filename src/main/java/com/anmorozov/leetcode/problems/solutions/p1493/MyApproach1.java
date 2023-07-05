package com.anmorozov.leetcode.problems.solutions.p1493;

public class MyApproach1 implements Solution {

    @Override
    public int longestSubarray(int[] nums) {
        int previousArraySize = 0;
        int currentArraySize = 0;
        int maxArraySize = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentArraySize += 1;
                if (i == nums.length - 1) {
                    if (maxArraySize < (previousArraySize + currentArraySize)) {
                        maxArraySize = (previousArraySize + currentArraySize);
                    }
                }
            } else if (nums[i] == 0) {
                if (maxArraySize < (previousArraySize + currentArraySize)) {
                    maxArraySize = (previousArraySize + currentArraySize);
                }
                previousArraySize = currentArraySize;
                currentArraySize = 0;
            }
        }

        if (maxArraySize == nums.length) {
            maxArraySize -= 1;
        }
        return maxArraySize;
    }
}
