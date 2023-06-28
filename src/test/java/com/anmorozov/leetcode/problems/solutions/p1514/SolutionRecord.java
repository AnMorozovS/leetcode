package com.anmorozov.leetcode.problems.solutions.p1514;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public record SolutionRecord(String message, int n, int[][] edges, double[] succProb, int start, int end,
                             double output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.n, s.edges, s.succProb, s.start, s.end, s.output);
    }
}
