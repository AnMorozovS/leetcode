package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.anmorozov.leetcode.common.ListNode;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0876Test {

    static Stream<Arguments> middleNode() throws IOException {
        BaseTest<P0876Test, SolutionRecord> baseTest = new BaseTest<>(P0876Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @ParameterizedTest(name = "{index} called with: {0}")
    @MethodSource
    void middleNode(String message, ListNode head, ListNode output) {
        P0876 p0876 = new P0876();
        ListNode actual = p0876.middleNode(head);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] head, int[] output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message(), ListNode.createFromArray(s.head()), ListNode.createFromArray(s.output()));
        }
    }
}

