package com.anmorozov.leetcode.problems.solutions.p1971;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int n, int[][] edges, int source, int destination, boolean output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.n, s.edges, s.source, s.destination, s.output);
    }
}
