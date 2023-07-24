package com.anmorozov.leetcode.problems.solutions.p0050;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, double x, int n, double output) {

    public static Arguments getArguments(SolutionRecord s) {

        return arguments(s.message, s.x, s.n, s.output);
    }
}