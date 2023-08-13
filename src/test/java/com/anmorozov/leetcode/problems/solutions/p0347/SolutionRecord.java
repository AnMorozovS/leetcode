package com.anmorozov.leetcode.problems.solutions.p0347;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public record SolutionRecord(String message, int[] nums, int k, int[] output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.nums, s.k, s.output);
    }
}
