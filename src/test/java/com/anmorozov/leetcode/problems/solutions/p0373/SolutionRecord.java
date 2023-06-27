package com.anmorozov.leetcode.problems.solutions.p0373;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int[] nums1, int[] nums2, int k, int[][] output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.nums1, s.nums2, s.k,
                Arrays.stream(s.output).map(x -> Arrays.stream(x).boxed().collect(
                        Collectors.toList())).collect(Collectors.toList()));
    }
}
