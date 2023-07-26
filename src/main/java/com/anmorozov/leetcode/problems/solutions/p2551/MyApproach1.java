package com.anmorozov.leetcode.problems.solutions.p2551;

public class MyApproach1 implements Solution {

    private int[] weights;

    @Override
    public long putMarbles(int[] weights, int k) {
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
