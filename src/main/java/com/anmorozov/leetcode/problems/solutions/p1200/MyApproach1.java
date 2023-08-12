package com.anmorozov.leetcode.problems.solutions.p1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * My Approach 1 : Sort then check
 */
public class MyApproach1 implements Solution {

    @Override
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int minDif = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int a = arr[i - 1];
            int b = arr[i];
            int diff = b - a;
            if (minDif > diff) {
                minDif = diff;
                result = new ArrayList<>();
                result.add(List.of(a, b));
            } else if (minDif == diff) {
                result.add(List.of(a, b));
            }
        }
        return result;
    }
}
