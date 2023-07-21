package com.anmorozov.leetcode.problems.solutions.p0673;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MyApproach1 implements Solution {

    @Override
    public int findNumberOfLIS(int[] nums) {
        SortedMap<Integer, SortedMap<Integer, Integer>> previousSizeCount = new TreeMap<>();
        int maxSize = 1;
        for (int num : nums) {
            SortedMap<Integer, Integer> sizeCount = previousSizeCount.computeIfAbsent(num,
                    x -> new TreeMap<>(Map.of(1, 0)));
            int singleCount = sizeCount.get(1);
            sizeCount.put(1, singleCount + 1);
            SortedMap<Integer, SortedMap<Integer, Integer>> smallerPrevious = previousSizeCount.headMap(num);
            for (SortedMap<Integer, Integer> value : smallerPrevious.values()) {
                for (Map.Entry<Integer, Integer> entry : value.entrySet()) {
                    int newSize = entry.getKey() + 1;
                    int previousCount = sizeCount.getOrDefault(newSize, 0);
                    sizeCount.put(newSize, previousCount + entry.getValue());
                    if (maxSize < newSize) {
                        maxSize = newSize;
                    }
                }
            }
        }
        int count = 0;
        for (SortedMap<Integer, Integer> value : previousSizeCount.values()) {
            count += value.getOrDefault(maxSize, 0);
        }
        return count;
    }

}
