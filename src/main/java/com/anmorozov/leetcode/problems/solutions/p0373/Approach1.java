package com.anmorozov.leetcode.problems.solutions.p0373;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import javafx.util.Pair;

public class Approach1 implements Solution {

    @Override
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;

        List<List<Integer>> ans = new ArrayList<>();
        Set<Pair<Integer, Integer>> visited = new HashSet<>();

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        minHeap.offer(new int[] {nums1[0] + nums2[0], 0, 0});
        visited.add(new Pair<>(0, 0));

        while (k-- > 0 && !minHeap.isEmpty()) {
            int[] top = minHeap.poll();
            int i = top[1];
            int j = top[2];

            ans.add(List.of(nums1[i], nums2[j]));

            if (i + 1 < m && !visited.contains(new Pair<>(i + 1, j))) {
                minHeap.offer(new int[] {nums1[i + 1] + nums2[j], i + 1, j});
                visited.add(new Pair<>(i + 1, j));
            }

            if (j + 1 < n && !visited.contains(new Pair<>(i, j + 1))) {
                minHeap.offer(new int[] {nums1[i] + nums2[j + 1], i, j + 1});
                visited.add(new Pair<>(i, j + 1));
            }
        }

        return ans;
    }
}
