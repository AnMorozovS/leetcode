package com.anmorozov.leetcode.problems.solutions.p0743;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int[][] times, int n, int k, int output) {

    public static Arguments getArguments(
            SolutionRecord s) {
        return arguments(s.message, s.times, s.n, s.k, s.output);
    }
}