package com.anmorozov.leetcode.problems.solutions.p1051;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * @param message from test case
 * @param heights representing the current order that the students are standing in
 * @param output  number of indices where heights[i] != expected[i]
 */
public record SolutionRecord(String message, int[] heights, int output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.heights, s.output);
    }
}
