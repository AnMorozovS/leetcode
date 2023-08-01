package com.anmorozov.leetcode.problems.solutions.p2361;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int[] regular, int[] express, int expressCost, long[] output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.regular, s.express, s.expressCost, s.output);
    }
}