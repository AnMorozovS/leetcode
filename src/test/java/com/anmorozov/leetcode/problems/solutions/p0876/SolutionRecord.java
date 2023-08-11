package com.anmorozov.leetcode.problems.solutions.p0876;

import com.anmorozov.leetcode.common.ListNode;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public record SolutionRecord(String message, int[] head, int[] output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message(), ListNode.createFromArray(s.head()), ListNode.createFromArray(s.output()));
    }
}
