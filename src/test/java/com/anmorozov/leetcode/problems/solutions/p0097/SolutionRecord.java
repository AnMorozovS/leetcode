package com.anmorozov.leetcode.problems.solutions.p0097;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public record SolutionRecord(String message, String s1, String s2, String s3, boolean output) {

    public static Arguments getArguments(SolutionRecord s) {

        return arguments(s.message, s.s1, s.s2, s.s3, s.output);
    }
}
