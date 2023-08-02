package com.anmorozov.leetcode.problems.solutions.p0046;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * My Approach : recursion
 */
public class MyApproach1 implements Solution {

    @Override
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> notUsed = IntStream.of(nums).boxed().collect(Collectors.toSet());
        addToArray(notUsed, result, List.of());
        return result;
    }

    private void addToArray(Set<Integer> notUsed, List<List<Integer>> result, List<Integer> list) {
        if (notUsed.isEmpty()) {
            result.add(list);
            return;
        }
        for (int i : notUsed) {
            Set<Integer> newSet = new HashSet<>(notUsed);
            newSet.remove(i);
            List<Integer> newList = new ArrayList<>(list);
            newList.add(i);
            addToArray(newSet, result, newList);
        }
    }
}
