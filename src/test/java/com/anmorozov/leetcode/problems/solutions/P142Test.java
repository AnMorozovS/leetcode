package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.anmorozov.leetcode.common.ListNode;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P142Test {

    private static List<Arguments> testCases;

    @BeforeAll
    static void beforeAll() throws IOException {
        BaseTest<P142Test, SolutionRecord> baseTest = new BaseTest<>(P142Test.class, new TypeReference<>() {
        }, P142Test.SolutionRecord::getArguments);
        testCases = baseTest.prepare();

    }

    static Stream<Arguments> detectCycle() {
        return testCases.stream();
    }

    @ParameterizedTest(name = "{index} called with: {0}")
    @MethodSource
    void detectCycle(String message, ListNode head, int output) {
        P142 p142 = new P142();
        LocalDateTime startTime1 = LocalDateTime.now();
        long startTime = System.nanoTime();
        ListNode actual = p142.detectCycle(head);
        long endTime = System.nanoTime();
        LocalDateTime endTime1 = LocalDateTime.now();
        assertEquals(output, ListNode.getIndex(head, actual));
        System.out.printf("Start (%1$tL - %2$tL) for %3$f\n", startTime1, endTime1,
                (endTime - startTime) / 1000000000d);
    }

    record SolutionRecord(String message, int[] head, int pos, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message(), ListNode.addCycleToEnd(ListNode.createFromArray(s.head()), s.pos),
                    s.output());
        }
    }
}