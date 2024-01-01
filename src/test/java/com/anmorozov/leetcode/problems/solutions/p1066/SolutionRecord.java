package com.anmorozov.leetcode.problems.solutions.p1066;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public record SolutionRecord(String message, int[][] workers, int[][] bikes, int output) {
    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.workers, s.bikes, s.output);
    }
}