package com.anmorozov.leetcode.problems.solutions.p0063;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public record SolutionRecord(String message, int[][] obstacleGrid, int output) {

    public static Arguments getArguments(SolutionRecord s) {

        return arguments(s.message, s.obstacleGrid, s.output);
    }
}