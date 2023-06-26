package com.anmorozov.leetcode.problems.solutions.p2462;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int[] costs, int k, int candidates, long output) {

    public static Arguments getArguments(
            SolutionRecord s) {
        return arguments(s.message, s.costs, s.k, s.candidates, s.output);
    }
}
