package com.anmorozov.leetcode.problems.solutions;

public class P1150 {

    private int numsLength;
    private int arrayMiddleIndex;
    private int[] nums;

    public boolean isMajorityElement(int[] nums, int target) {
        this.nums = nums;
        this.numsLength = this.nums.length;
        this.arrayMiddleIndex = numsLength / 2;
        if (this.nums[arrayMiddleIndex] != target) {
            return false;
        }
        return isMajority(-1, arrayMiddleIndex, arrayMiddleIndex, numsLength, target);
    }

    public boolean isMajority(int earliestNonTarget, int earliestTarget, int oldestTarget, int oldestNonTarget,
                              int target) {
        if (earliestTarget > 0 && earliestNonTarget + 1 < earliestTarget) {
            int firstIndex = getMiddle(earliestTarget, earliestNonTarget);
            if (this.nums[firstIndex] == target) {
                earliestTarget = firstIndex;
            } else {
                earliestNonTarget = firstIndex;
            }
        }
        if (oldestTarget < numsLength && oldestTarget + 1 < oldestNonTarget) {
            int secondIndex = getMiddle(oldestTarget, oldestNonTarget);
            if (this.nums[secondIndex] == target) {
                oldestTarget = secondIndex;
            } else {
                oldestNonTarget = secondIndex;
            }
        }
        if ((oldestTarget - earliestTarget + 1) > arrayMiddleIndex) {
            return true;
        } else if ((earliestNonTarget + 1 + numsLength - oldestNonTarget) >= arrayMiddleIndex) {
            return false;
        } else {
            return isMajority(earliestNonTarget, earliestTarget, oldestTarget, oldestNonTarget, target);
        }

    }

    public int getMiddle(int target, int nonTarget) {
        if (target > nonTarget) {
            return nonTarget + (target - nonTarget) / 2;
        } else {
            return target + (nonTarget - target) / 2;
        }
    }

}
