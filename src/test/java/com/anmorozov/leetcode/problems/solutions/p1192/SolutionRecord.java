package com.anmorozov.leetcode.problems.solutions.p1192;

import java.util.List;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int n, List<List<Integer>> connections, List<List<Integer>> output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.n, s.connections, s.output);
    }
}