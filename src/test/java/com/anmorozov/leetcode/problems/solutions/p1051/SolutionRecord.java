package com.anmorozov.leetcode.problems.solutions.p1051;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public record SolutionRecord(String message, int[] heights, int output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.heights, s.output);
    }
}
