package com.anmorozov.leetcode.problems.solutions.p0347;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyApproach1 implements Solution {

    @Override
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : nums) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        Queue<ValueFrequency> queue = new PriorityQueue<>(Comparator.comparingInt(x -> -1 * x.count()));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.add(new ValueFrequency(entry.getKey(), entry.getValue()));
        }
        int[] result = new int[k];
        for (int i = 0; i < k && !queue.isEmpty(); i++) {
            result[i] = queue.poll().value();
        }
        return result;
    }

}
