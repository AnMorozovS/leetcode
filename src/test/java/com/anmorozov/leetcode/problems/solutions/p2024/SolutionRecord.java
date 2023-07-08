package com.anmorozov.leetcode.problems.solutions.p2024;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, String answerKey, int k, int output) {

    public static Arguments getArguments(
            SolutionRecord s) {
        return arguments(s.message, s.answerKey, s.k, s.output);
    }
}
