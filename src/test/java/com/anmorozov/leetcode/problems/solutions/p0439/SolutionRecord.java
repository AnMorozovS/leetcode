package com.anmorozov.leetcode.problems.solutions.p0439;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, String expression, String output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.expression, s.output);
    }
}
