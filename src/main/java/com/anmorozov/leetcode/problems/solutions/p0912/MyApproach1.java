package com.anmorozov.leetcode.problems.solutions.p0912;

import com.anmorozov.leetcode.problems.algorithms.sort.comparison.HeapSort;

/**
 * My Approach 1 : Heap Sort
 */
public class MyApproach1 implements Solution {

    @Override
    public Integer[] sortArray(Integer[] nums) {
        HeapSort<Integer> heapSort = new HeapSort<>(new Integer[] {});
        heapSort.heapSort(nums);
        return nums;
    }
}
