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

class P0746Test {

    static Stream<Arguments> minCostClimbingStairs() throws IOException {
        BaseTest<P0746Test, SolutionRecord> baseTest = new BaseTest<>(P0746Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource
    void minCostClimbingStairs(String message, int[] cost, int output) {
        P0746 p0746 = new P0746();
        int actual = p0746.minCostClimbingStairs(cost);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] cost, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.cost, s.output);
        }
    }
}