package com.anmorozov.leetcode.problems.solutions.p0373;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MyApproach1 implements Solution {

    @Override
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        PriorityQueue<List<Integer>> queue = new PriorityQueue<>(Comparator.comparingInt(x -> (x.get(0) + x.get(1))));

        for (int i : nums1) {
            for (int j : nums2) {
                queue.add(List.of(i, j));
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        while (queue.size() > 0 && result.size() < k) {
            result.add(queue.poll());
        }
        return result;
    }
}
