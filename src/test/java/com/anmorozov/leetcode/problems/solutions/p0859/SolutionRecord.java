package com.anmorozov.leetcode.problems.solutions.p0859;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, String s, String goal, boolean output) {

    public static Arguments getArguments(
            SolutionRecord s) {
        return arguments(s.message, s.s, s.goal, s.output);
    }
}