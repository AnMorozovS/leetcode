package com.anmorozov.leetcode.problems.algorithms.sort.noncomparison;

import java.util.Arrays;

public class CountingSort implements NonComparisonSort {

    @Override
    public void sort(int[] arr) {
        // Sorts an array of integers (handles shifting of integers to range 0 to maximumValue)
        int shift = Arrays.stream(arr).min().orElse(0);
        int maximumValue = Arrays.stream(arr).max().orElse(0) - shift;
        int[] counts = new int[maximumValue + 1];
        for (int elem : arr) {
            counts[elem - shift] += 1;
        }
        // we now overwrite our original counts with the starting index
        // of each element in the final sorted array
        int startingIndex = 0;
        for (int i = 0; i < maximumValue + 1; i++) {
            int count = counts[i];
            counts[i] = startingIndex;
            startingIndex += count;
        }

        int[] sortedArray = new int[arr.length];
        for (int elem : arr) {
            sortedArray[counts[elem - shift]] = elem;
            // since we have placed an item in index counts[elem], we need to
            // increment counts[elem] index by 1 so the next duplicate element
            // is placed in appropriate index
            counts[elem - shift] += 1;
        }

        // common practice to copy over sorted list into original arr
        // it's fine to just return the sortedArray at this point as well
        System.arraycopy(sortedArray, 0, arr, 0, arr.length);
    }
}
