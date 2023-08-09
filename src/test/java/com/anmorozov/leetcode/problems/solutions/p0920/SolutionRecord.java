package com.anmorozov.leetcode.problems.solutions.p0920;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int n, int goal, int k, int output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.n, s.goal, s.k, s.output);
    }
}
