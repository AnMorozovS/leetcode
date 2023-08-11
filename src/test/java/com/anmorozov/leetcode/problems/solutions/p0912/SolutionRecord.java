package com.anmorozov.leetcode.problems.solutions.p0912;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, Integer[] nums, Integer[] output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.nums, s.output);
    }
}
