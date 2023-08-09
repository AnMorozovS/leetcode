package com.anmorozov.leetcode.problems.solutions.p2616;

import java.util.Arrays;

public class MyApproach1 implements Solution {

    private int countValidPairs(int[] nums, int threshold) {
        int index = 0;
        int count = 0;
        while (index < nums.length - 1) {
            if (nums[index + 1] - nums[index] <= threshold) {
                count++;
                index++;
            }
            index++;
        }
        return count;
    }

    @Override
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        int right = nums[n - 1] - nums[0];

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (countValidPairs(nums, mid) >= p) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
