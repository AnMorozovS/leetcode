package com.anmorozov.leetcode.problems.algorithms.sort.noncomparison;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record IntegerArrayRecord(String message, int[] input, int[] output) {

    public static Arguments getArguments(IntegerArrayRecord s) {

        return arguments(s.message, s.input, s.output);
    }
}