package com.anmorozov.leetcode.problems.solutions.p0852;

/**
 * My Approach 1: Binary Search
 */
public class MyApproach1 implements Solution {

    @Override
    public int peakIndexInMountainArray(int[] arr) {
        int currentIndex = arr.length / 2;
        int currentMaxMin = 0;
        int currentMinMax = arr.length - 1;
        while (arr[currentIndex - 1] >= arr[currentIndex] || arr[currentIndex + 1] >= arr[currentIndex]) {
            if (arr[currentIndex] < arr[currentIndex + 1] && arr[currentIndex - 1] < arr[currentIndex]) {
                currentMaxMin = currentIndex;
            } else if (arr[currentIndex - 1] > arr[currentIndex] && arr[currentIndex] > arr[currentIndex + 1]) {
                currentMinMax = currentIndex;
            }
            currentIndex = currentMaxMin + Math.max(1, (currentMinMax - currentMaxMin) / 2);
        }
        return currentIndex;
    }
}
