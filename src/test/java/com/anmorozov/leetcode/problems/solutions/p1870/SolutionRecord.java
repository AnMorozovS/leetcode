package com.anmorozov.leetcode.problems.solutions.p1870;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int[] dist, double hour, int output) {

    public static Arguments getArguments(
            SolutionRecord s) {
        return arguments(s.message, s.dist, s.hour, s.output);
    }
}