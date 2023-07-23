package com.anmorozov.leetcode.problems.solutions.p0894;

import java.util.List;
import java.util.Set;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int n, Set<List<Integer>> output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.n, s.output);
    }
}
