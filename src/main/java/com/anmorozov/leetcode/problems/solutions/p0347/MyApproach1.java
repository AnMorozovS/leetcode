package com.anmorozov.leetcode.problems.solutions.p0347;

import java.util.*;

public class MyApproach1 implements Solution {

    @Override
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : nums) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        Queue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(map::get));
        for (int n : map.keySet()) {
            heap.add(n);
            if (heap.size() > k) heap.poll();
        }
        int[] result = new int[k];
        for (int i = k - 1; !heap.isEmpty() && i >= 0; i--) {
            result[i] = heap.poll();
        }
        return result;
    }

}
