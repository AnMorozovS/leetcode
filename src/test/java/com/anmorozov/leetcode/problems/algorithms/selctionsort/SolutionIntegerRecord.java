package com.anmorozov.leetcode.problems.algorithms.selctionsort;

import java.util.List;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionIntegerRecord(String message, List<Integer> input, List<Integer> output) {

    public static Arguments getArguments(SolutionIntegerRecord s) {

        return arguments(s.message, s.input, new Integer[] {}, s.output);
    }
}