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

class P746Test {

    private static List<Arguments> testCases;

    @BeforeAll
    static void beforeAll() throws IOException {
        BaseTest<P746Test, SolutionRecord> baseTest = new BaseTest<>(P746Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        testCases = baseTest.prepare();

    }

    static Stream<Arguments> minCostClimbingStairs() {
        return testCases.stream();
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource
    void minCostClimbingStairs(String message, int[] cost, int output) {
        P746 p746 = new P746();
        int actual = p746.minCostClimbingStairs(cost);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] cost, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.cost, s.output);
        }
    }
}