package com.anmorozov.leetcode.problems.solutions.p1129;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int n, int[][] redEdges, int[][] blueEdges, int[] output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.n, s.redEdges, s.blueEdges, s.output);
    }
}