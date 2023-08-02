package com.anmorozov.leetcode.problems.solutions.p0046;

import java.util.List;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int[] nums, List<List<Integer>> output) {

    public static Arguments getArguments(SolutionRecord s) {

        return arguments(s.message, s.nums, s.output);
    }
}