package com.anmorozov.leetcode.problems.solutions.p0017;

import java.util.List;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, String digits, List<String> output) {

    public static Arguments getArguments(SolutionRecord s) {

        return arguments(s.message, s.digits, s.output);
    }
}