package com.anmorozov.leetcode.problems.solutions.p2305;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int[] cookies, int k, int output) {

    public static Arguments getArguments(
            SolutionRecord s) {
        return arguments(s.message, s.cookies, s.k, s.output);
    }
}
