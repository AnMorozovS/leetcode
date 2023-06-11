package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0121Test {

    static Stream<Arguments> maxProfit() throws IOException {
        BaseTest<P0121Test, SolutionRecord> baseTest = new BaseTest<>(P0121Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @ParameterizedTest(name = "{index} {0} called with: {1}")
    @MethodSource
    void maxProfit(String message, int[] prices, int profit) {
        P0121 p0121 = new P0121();
        int actual = p0121.maxProfit(prices);
        assertEquals(profit, actual);
    }

    record SolutionRecord(String message, int[] prices, int profit) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.prices, s.profit);
        }
    }
}