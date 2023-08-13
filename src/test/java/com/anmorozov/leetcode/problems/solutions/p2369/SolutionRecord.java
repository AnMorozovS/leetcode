package com.anmorozov.leetcode.problems.solutions.p2369;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int[] nums, boolean output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.nums, s.output);
    }
}