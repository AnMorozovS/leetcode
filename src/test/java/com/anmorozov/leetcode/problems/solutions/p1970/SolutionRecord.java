package com.anmorozov.leetcode.problems.solutions.p1970;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int row, int col, int[][] cells, int output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.row, s.col, s.cells, s.output);
    }
}