package com.anmorozov.leetcode.problems.solutions.p0841;

import java.util.List;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, List<List<Integer>> rooms, boolean output) {

    public static Arguments getArguments(
            SolutionRecord s) {
        return arguments(s.message, s.rooms, s.output);
    }
}