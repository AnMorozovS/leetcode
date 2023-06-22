package com.anmorozov.leetcode.problems.solutions.p0714;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("714. Best Time to Buy and Sell Stock with Transaction Fee.")
class SolutionTest {

    static Stream<Arguments> maxProfit() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("maxProfit")
    @ParameterizedTest(name = "{0}: prices = {1}, fee = {2}, output = {3}")
    @MethodSource
    void maxProfit(String message, int[] prices, int fee, int output) {
        Solution solution = new Approach2();
        int actual = solution.maxProfit(prices, fee);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] prices, int fee, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.prices, s.fee, s.output);
        }
    }

}