package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.anmorozov.leetcode.common.ListNode;
import com.anmorozov.leetcode.problems.solutions.P876Test.SolutionRecord;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;


class P876Test extends BaseTest<P876Test, SolutionRecord> {

    private static List<Arguments> testCases;

    private P876Test() {
        super(P876Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
    }

    @BeforeAll
    static void beforeAll() throws IOException {
        P876Test baseTest = new P876Test();
        testCases = baseTest.prepare();
    }

    static Stream<Arguments> middleNode() {
        return testCases.stream();
    }

    @ParameterizedTest(name = "{index} called with: {0}")
    @MethodSource
    void middleNode(String message, ListNode head, ListNode output) {
        P876 p876 = new P876();
        ListNode actual = p876.middleNode(head);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] head, int[] output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message(), ListNode.createFromArray(s.head()), ListNode.createFromArray(s.output()));
        }
    }
}

