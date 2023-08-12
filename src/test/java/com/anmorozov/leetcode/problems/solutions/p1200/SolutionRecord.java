package com.anmorozov.leetcode.problems.solutions.p1200;

import java.util.List;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public record SolutionRecord(String message, int[] arr, List<List<Integer>> output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.arr, s.output);
    }
}
