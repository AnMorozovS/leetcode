package com.anmorozov.leetcode.problems.solutions.p1027;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Approach: Dynamic Programming
 */
public class Approach1 implements Solution {

    @Override
    @SuppressWarnings("SpellCheckingInspection")
    public int longestArithSeqLength(int[] nums) {

        List<Map<Integer, Integer>> sequenceSizeByIncrementForEachIndex = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            sequenceSizeByIncrementForEachIndex.add(i, new HashMap<>());
            for (int j = 0; j < i; ++j) {
                int increment = nums[j] - nums[i];
                sequenceSizeByIncrementForEachIndex.get(i)
                        .put(increment, sequenceSizeByIncrementForEachIndex.get(j).getOrDefault(increment, 1) + 1);

            }
        }
        int maxLength = 0;
        for (Map<Integer, Integer> map : sequenceSizeByIncrementForEachIndex) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                maxLength = Math.max(maxLength, entry.getValue());
            }
        }
        return maxLength;
    }
}
