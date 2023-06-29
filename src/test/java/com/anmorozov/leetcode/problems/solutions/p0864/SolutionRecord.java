package com.anmorozov.leetcode.problems.solutions.p0864;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, String[] grid, int output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.grid, s.output);
    }
}