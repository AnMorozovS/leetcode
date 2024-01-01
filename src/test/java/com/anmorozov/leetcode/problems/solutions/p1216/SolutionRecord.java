package com.anmorozov.leetcode.problems.solutions.p1216;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, String s, int k, boolean output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.s, s.k, s.output);
    }
}