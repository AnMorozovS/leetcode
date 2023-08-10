package com.anmorozov.leetcode.problems.solutions.p0271;

import java.util.List;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public record SolutionRecord(String message, List<String> dummy_input, List<String> output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, s.dummy_input, s.output);
    }
}