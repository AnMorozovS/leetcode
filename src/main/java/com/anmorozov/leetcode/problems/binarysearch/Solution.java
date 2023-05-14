package com.anmorozov.leetcode.problems.binarysearch;

class Solution {

    public int search(int[] nums, int target) {
        int largestIndex = nums.length - 1;
        int smallestIndex = 0;
        int currentIndex;
        while (smallestIndex <= largestIndex) {
            currentIndex = smallestIndex + (largestIndex - smallestIndex) / 2;
            System.out.printf("currentIndex = %1$d , largestIndex = %2$d , smallestIndex %3$d\n", currentIndex,
                    largestIndex, smallestIndex);
            System.out.printf("nums[%1$d] == %2$d\n", currentIndex, nums[currentIndex]);
            if (nums[currentIndex] == target) {
                return currentIndex;
            } else if (nums[currentIndex] > target) {
                largestIndex = currentIndex - 1;
            } else {
                smallestIndex = currentIndex + 1;
            }
        }
        return -1;
    }
}