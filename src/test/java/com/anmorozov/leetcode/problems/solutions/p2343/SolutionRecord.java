package com.anmorozov.leetcode.problems.solutions.p2343;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public record SolutionRecord(String message, String[] nums, int[][] queries, int[] output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.nums, s.queries, s.output);
    }
}
