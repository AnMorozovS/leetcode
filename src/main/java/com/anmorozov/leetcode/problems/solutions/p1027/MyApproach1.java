package com.anmorozov.leetcode.problems.solutions.p1027;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyApproach1 implements Solution {

    @Override
    @SuppressWarnings("SpellCheckingInspection")
    public int longestArithSeqLength(int[] nums) {
        int maxSequence = 0;
        Map<Integer, Set<Integer>> usedIncrement = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int firstElement = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                List<Integer> arithmeticSequence = new ArrayList<>();
                int secondElement = nums[j];
                int increment = secondElement - firstElement;
                if (usedIncrement.containsKey(increment)) {
                    if (usedIncrement.get(increment).contains(i)) {
                        continue;
                    }
                }
                arithmeticSequence.add(i);
                arithmeticSequence.add(j);
                int previousElement = secondElement;
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[k] == previousElement + increment) {
                        arithmeticSequence.add(k);
                        previousElement = nums[k];
                    }
                }
                if (maxSequence < arithmeticSequence.size()) {
                    maxSequence = arithmeticSequence.size();
                }
                if (usedIncrement.containsKey(increment)) {
                    usedIncrement.get(increment).addAll(arithmeticSequence);
                } else {
                    usedIncrement.put(increment, new HashSet<>(arithmeticSequence));
                }
            }
        }
        return maxSequence;
    }
}
