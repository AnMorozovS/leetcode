package com.anmorozov.leetcode.problems.solutions.p0209;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int target, int[] nums, int output) {

    public static Arguments getArguments(
            SolutionRecord s) {
        return arguments(s.message, s.target, s.nums, s.output);
    }
}
