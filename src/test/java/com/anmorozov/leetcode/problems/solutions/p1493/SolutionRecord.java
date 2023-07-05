package com.anmorozov.leetcode.problems.solutions.p1493;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int[] nums, int output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.nums, s.output);
    }
}
