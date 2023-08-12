package com.anmorozov.leetcode.problems.algorithms.sort.noncomparison;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public record SolutionRecord(String message, int[] input, int[] output) {

    public static Arguments getArguments(SolutionRecord s) {

        return arguments(s.message, s.input, s.output);
    }
}