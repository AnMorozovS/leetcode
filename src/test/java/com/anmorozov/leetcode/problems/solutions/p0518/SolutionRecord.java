package com.anmorozov.leetcode.problems.solutions.p0518;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int amount, int[] coins, int output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.amount, s.coins, s.output);
    }
}