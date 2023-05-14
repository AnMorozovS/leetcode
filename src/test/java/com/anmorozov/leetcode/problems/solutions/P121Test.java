package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.problems.common.BaseTest;
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

class P121Test {

    private static List<Arguments> testCases;

    @BeforeAll
    static void beforeAll() throws IOException {
        BaseTest<P121Test, SolutionRecord> baseTest = new BaseTest<>(P121Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        testCases = baseTest.prepare();

    }

    static Stream<Arguments> maxProfit() {
        return testCases.stream();
    }

    @ParameterizedTest(name = "{index} {0} called with: {1}")
    @MethodSource
    void maxProfit(String message, int[] prices, int profit) {
        P121 p121 = new P121();
        int actual = p121.maxProfit(prices);
        assertEquals(profit, actual);
    }

    record SolutionRecord(String message, int[] prices, int profit) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.prices, s.profit);
        }
    }
}