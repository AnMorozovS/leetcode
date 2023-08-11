package com.anmorozov.leetcode.problems.solutions.p0142;

import com.anmorozov.leetcode.common.ListNode;
import java.util.Arrays;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public record SolutionRecord(String message, int[] head, int pos, int output) {

    public static Arguments getArguments(SolutionRecord s) {

        ListNode head = ListNode.addCycleToEnd(ListNode.createFromArray(s.head()), s.pos);
        ListNode output = head == null ? null : head.getByIndex(s.output);
        String message =
                s.message + ": head =" + Arrays.toString(s.head) + ", pos = " + s.pos + ", output = " + s.output;

        return arguments(message, head, output);
    }
}
