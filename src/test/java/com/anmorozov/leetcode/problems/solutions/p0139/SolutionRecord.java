package com.anmorozov.leetcode.problems.solutions.p0139;

import java.util.List;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, String s, List<String> wordDict, boolean output) {

    public static Arguments getArguments(
            SolutionRecord s) {
        return arguments(s.message, s.s, s.wordDict, s.output);
    }
}
