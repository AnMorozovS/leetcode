package com.anmorozov.leetcode.problems.solutions.p0210;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int numCourses, int[][] prerequisites, int[] output) {

    public static Arguments getArguments(
            SolutionRecord s) {
        return arguments(s.message, s.numCourses, s.prerequisites, s.output);
    }
}