package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.anmorozov.leetcode.common.ListNode;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("142. Linked List Cycle II.")
class P0142Test {

    static Stream<Arguments> detectCycle() throws IOException {
        BaseTest<P0142Test, SolutionRecord> baseTest = new BaseTest<>(P0142Test.class, new TypeReference<>() {
        }, P0142Test.SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("detectCycle")
    @ParameterizedTest(name = "{0}: head = {1}, output = {2}")
    @MethodSource
    void detectCycle(String message, ListNode head, int output) {
        P0142 p0142 = new P0142();
        ListNode actual = p0142.detectCycle(head);
        assertEquals(output, ListNode.getIndex(head, actual));
    }

    record SolutionRecord(String message, int[] head, int pos, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message(), ListNode.addCycleToEnd(ListNode.createFromArray(s.head()), s.pos),
                    s.output());
        }
    }
}