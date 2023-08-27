package com.anmorozov.leetcode.problems.solutions.p0403;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int[] stones, boolean output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.stones, s.output);
    }
}