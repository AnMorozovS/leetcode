package com.anmorozov.leetcode.problems.solutions;

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

@DisplayName("2448. Minimum Cost to Make Array Equal.")
class P2448Test {

    static Stream<Arguments> minCost() throws IOException {
        BaseTest<P2448Test, SolutionRecord> baseTest = new BaseTest<>(P2448Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("minCost")
    @ParameterizedTest(name = "{0}: nums = {1}, cost = {2}, output = {3}")
    @MethodSource
    void minCost(String message, int[] nums, int[] cost, long output) {
        P2448 p2448 = new P2448();
        long actual = p2448.minCost(nums, cost);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] nums, int[] cost, long output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.nums, s.cost, s.output);
        }
    }

}