package com.anmorozov.leetcode.problems.solutions.p0688;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int n, int k, int row, int column, double output) {

    public static Arguments getArguments(
            SolutionRecord s) {
        return arguments(s.message, s.n, s.k, s.row, s.column, s.output);
    }
}
