package com.anmorozov.leetcode.problems.solutions.p0077;

import java.util.ArrayList;
import java.util.List;

/**
 * My Approach 1 : recursion
 */
public class MyApproach1 implements Solution {

    int[] range;

    @Override
    public List<List<Integer>> combine(int n, int k) {
        range = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            range[i] = i;
        }
        return fillResult(1, k, List.of());
    }

    private List<List<Integer>> fillResult(int index, int left, List<Integer> currentList) {
        if (left == 0) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(currentList);
            return result;
        }
        List<Integer> paramArray1 = new ArrayList<>(currentList);
        paramArray1.add(range[index]);
        List<List<Integer>> result1 = fillResult(index + 1, left - 1, paramArray1);
        List<List<Integer>> result2 = List.of();
        if (range.length - index > left) {
            List<Integer> paramArray2 = new ArrayList<>(currentList);
            result2 = fillResult(index + 1, left, paramArray2);
        }
        result1.addAll(result2);
        return result1;
    }
}
