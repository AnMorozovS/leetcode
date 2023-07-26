package com.anmorozov.leetcode.problems.solutions.p1466;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int n, int[][] connections, int output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.n, s.connections, s.output);
    }
}