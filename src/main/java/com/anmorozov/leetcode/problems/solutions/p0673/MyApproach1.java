package com.anmorozov.leetcode.problems.solutions.p0673;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MyApproach1 implements Solution {

    @Override
    public int findNumberOfLIS(int[] nums) {
        SortedMap<Integer, SortedMap<Integer, Integer>> previousSizeCount = new TreeMap<>(
                Map.of(Integer.MIN_VALUE, new TreeMap<>(Map.of(0, 0))));
        int maxSize = 0;
        for (int num : nums) {
            SortedMap<Integer, Integer> sizeCount = previousSizeCount.computeIfAbsent(num, x -> new TreeMap<>());
            SortedMap<Integer, SortedMap<Integer, Integer>> smallerPrevious = previousSizeCount.headMap(num);
            for (SortedMap<Integer, Integer> value : smallerPrevious.values()) {
                for (Integer size : value.keySet()) {
                    int newSize = size + 1;
                    int previousCount = sizeCount.getOrDefault(newSize, 0);
                    sizeCount.put(newSize, previousCount + 1);
                    if (maxSize < newSize) {
                        maxSize = newSize;
                    }
                }
            }
        }
        int count = 0;
        System.out.println(maxSize);
        for (SortedMap<Integer, Integer> value : previousSizeCount.values()) {
            count += value.getOrDefault(maxSize, 0);
        }
        return count;
    }

}
