package com.anmorozov.leetcode.problems.solutions.p0050;

public class MyApproach1 implements Solution {

    @Override
    public double myPow(double x, int n) {
        return binaryExp(x, n);
    }

    private double binaryExp(double x, long n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1.0 / binaryExp(x, -1 * n);
        }
        double mod = (n % 2 == 1) ? x : 1;
        return mod * binaryExp(x * x, n / 2);
    }
}
