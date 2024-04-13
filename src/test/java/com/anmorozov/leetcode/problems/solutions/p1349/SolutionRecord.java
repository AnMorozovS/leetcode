package com.anmorozov.leetcode.problems.solutions.p1349;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, char[][] seats, int output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.seats, s.output);
    }
}