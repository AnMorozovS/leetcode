package com.anmorozov.leetcode.problems.solutions.p2551;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyApproach1 implements Solution {

    private int[] weights;
    private Map<String, List<Integer>> cashMap;

    @Override
    public long putMarbles(int[] weights, int k) {
        cashMap = new HashMap<>();
        this.weights = weights;
        return 0;
    }

    private int distributeTheRemaining(int min, int max, int start, int index) {
        int value = this.weights[index];
        int sum = start + value;
        if (sum < min) {
            min = sum;
        }
        if (sum > max) {
            max = sum;
        }
        return max - min;
    }

}
