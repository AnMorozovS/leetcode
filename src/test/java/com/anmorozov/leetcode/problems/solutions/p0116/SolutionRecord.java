package com.anmorozov.leetcode.problems.solutions.p0116;

import java.util.Arrays;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int[] root, Integer[] output) {

    public static Arguments getArguments(SolutionRecord s) {
        String message = s.message + ": root=" + Arrays.toString(s.root) + ", output=" + Arrays.toString(s.output);
        return arguments(message, Node.parsePerfectTreeFromArray(s.root), Node.parseConnectedTreeFromArray(s.output));
    }
}
