package com.anmorozov.leetcode.problems.solutions.p0147;

import com.anmorozov.leetcode.common.ListNode;
import java.util.Arrays;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public record SolutionRecord(String message, int[] head, int[] output) {

    public static Arguments getArguments(SolutionRecord s) {

        String message = s.message + ": head =" + Arrays.toString(s.head) + ", output = " + Arrays.toString(s.output);
        return arguments(message, ListNode.createFromArray(s.head), ListNode.createFromArray(s.output));
    }
}