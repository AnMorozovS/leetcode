package com.anmorozov.leetcode.problems.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class P0163 {

    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        if (nums.length == 0) {
            return List.of(List.of(lower, upper));
        }
        NavigableSet<Integer> arr2Set = Arrays.stream(nums).boxed().collect(TreeSet::new, Set::add, (x, y) -> {
        });
        List<List<Integer>> result = new ArrayList<>();
        Integer higherLower = arr2Set.ceiling(lower);

        Integer lowerUpper = arr2Set.floor(upper);
        if (higherLower == null || lowerUpper == null) {
            return List.of();
        }
        Set<Integer> curSet = arr2Set.subSet(higherLower, true, lowerUpper, true);

        if (higherLower > lower) {
            result.add(List.of(lower, higherLower - 1));
        }

        int previous = higherLower;
        for (int nValue : curSet) {
            if (nValue == higherLower) {
                continue;
            }
            if (nValue > previous + 1) {
                result.add(List.of(previous + 1, nValue - 1));
            }
            previous = nValue;
        }
        if (lowerUpper < upper) {
            result.add(List.of(lowerUpper + 1, upper));
        }
        return result;
    }
}
