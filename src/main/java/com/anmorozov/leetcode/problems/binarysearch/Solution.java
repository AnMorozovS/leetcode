package com.anmorozov.leetcode.problems.binarysearch;

class Solution {

    public int search(int[] nums, int target) {
        int largestIndex = nums.length - 1;
        int smallestIndex = 0;
        int currentIndex;
        while (smallestIndex <= largestIndex) {
            currentIndex = smallestIndex + (largestIndex - smallestIndex) / 2;
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