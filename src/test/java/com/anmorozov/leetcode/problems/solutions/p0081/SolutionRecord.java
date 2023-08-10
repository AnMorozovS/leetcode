package com.anmorozov.leetcode.problems.solutions.p0081;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int[] nums, int target, boolean output) {

    public static Arguments getArguments(SolutionRecord s) {

        return arguments(s.message, s.nums, s.target, s.output);
    }
}