package com.anmorozov.leetcode.problems.solutions.p2483;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, String customers, int output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.customers, s.output);
    }
}