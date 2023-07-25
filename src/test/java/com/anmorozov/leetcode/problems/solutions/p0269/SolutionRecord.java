package com.anmorozov.leetcode.problems.solutions.p0269;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, String[] words, String output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.words, s.output);
    }
}