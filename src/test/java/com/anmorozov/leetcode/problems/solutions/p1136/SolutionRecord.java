package com.anmorozov.leetcode.problems.solutions.p1136;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int n, int[][] relations, int output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.n, s.relations, s.output);
    }
}
