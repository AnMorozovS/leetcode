package com.anmorozov.leetcode.problems.solutions.p2369;

import com.anmorozov.leetcode.common.Cache;

public class MyApproach1 implements Solution {

    private int[] nums;
    private Cache<Integer, Boolean> cache;

    @Override
    public boolean validPartition(int[] nums) {
        this.cache = new Cache<>();
        this.nums = nums;
        return this.cache.useCache(0, this::validPartition);
    }

    boolean validPartition(int index) {
        if (index == nums.length) {
            return true;
        }
        if (isDoubleSizeValid(index)) {
            if (this.cache.useCache(index + 2, this::validPartition)) {
                return true;
            }
        }
        if (isThirdSizeValid(index)) {
            return this.cache.useCache(index + 3, this::validPartition);
        }
        return false;
    }

    private boolean isDoubleEqual(int index) {
        return nums.length - index >= 2 && nums[index] == nums[index + 1];
    }

    private boolean isTripleEqual(int index) {
        return nums.length - index >= 3 && nums[index] == nums[index + 1] && nums[index + 1] == nums[index + 2];
    }

    private boolean isTripleSubsequence(int index) {
        return nums.length - index >= 3 && nums[index] + 1 == nums[index + 1] && nums[index + 1] + 1 == nums[index + 2];
    }

    private boolean isDoubleSizeValid(int index) {
        return isDoubleEqual(index);
    }

    private boolean isThirdSizeValid(int index) {
        return isTripleEqual(index) || isTripleSubsequence(index);
    }
}
