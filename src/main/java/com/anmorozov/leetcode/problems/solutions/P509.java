package com.anmorozov.leetcode.problems.solutions;

public class P509 {

    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(0, 1, 2, n);
        }
    }

    public int fib(int n0, int n1, int iteration, int n) {
        if (iteration >= n) {
            return n0 + n1;
        } else {
            return fib(n1, n0 + n1, ++iteration, n);
        }
    }
}
