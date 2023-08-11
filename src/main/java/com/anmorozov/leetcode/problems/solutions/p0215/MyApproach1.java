package com.anmorozov.leetcode.problems.solutions.p0215;

import java.util.PriorityQueue;

public class MyApproach1 implements Solution {

    @Override
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int num : nums) {
            heap.add(num);
            if (heap.size() > k) {
                heap.remove();
            }
        }
        Integer result = heap.peek();
        return result == null ? -1 : result;
    }
}
