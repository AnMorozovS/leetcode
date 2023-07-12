package com.anmorozov.leetcode.problems.solutions.p0802;

import java.util.List;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int[][] graph, List<Integer> output) {

    public static Arguments getArguments(
            SolutionRecord s) {
        return arguments(s.message, s.graph, s.output);
    }
}