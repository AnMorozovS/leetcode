package com.anmorozov.leetcode.problems.algorithms.selctionsort;

import java.util.List;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionStringRecord(String message, List<String> input, List<String> output) {

    public static Arguments getArguments(SolutionStringRecord s) {

        return arguments(s.message, s.input, new String[] {}, s.output);
    }
}
