package com.anmorozov.leetcode.problems.solutions.p0310;

import java.util.List;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int n, int[][] edges, List<Integer> output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.n, s.edges, s.output);
    }
}