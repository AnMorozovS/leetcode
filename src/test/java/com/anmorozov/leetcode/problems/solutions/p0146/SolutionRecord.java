package com.anmorozov.leetcode.problems.solutions.p0146;

import java.util.Arrays;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, String[] methods, int[][] parameters, Integer[] output) {

    public static Arguments getArguments(
            SolutionRecord s) {

        if (s.methods.length != s.parameters.length || s.methods.length == 0) {
            throw new RuntimeException("Constraint violation");
        }
        int capacity;
        if (s.methods[0].equals("LRUCache")) {
            capacity = s.parameters[0][0];
        } else {
            throw new RuntimeException("First method must be LRUCache");
        }
        String[] methods = Arrays.copyOfRange(s.methods, 1, s.methods.length);
        int[][] parameters = Arrays.copyOfRange(s.parameters, 1, s.parameters.length);
        Integer[] output = Arrays.copyOfRange(s.output, 1, s.output.length);
        return arguments(s.message, capacity, methods, parameters, output);
    }
}