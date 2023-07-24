package com.anmorozov.leetcode.problems.solutions.p0787;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int n, int[][] flights, int src, int dst, int k, int output) {

    public static Arguments getArguments(
            SolutionRecord s) {
        return arguments(s.message, s.n, s.flights, s.src, s.dst, s.k, s.output);
    }
}
