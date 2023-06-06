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

@DisplayName("1168. Optimize Water Distribution in a Village.")
class P1168Test {

    static Stream<Arguments> minCostToSupplyWater() throws IOException {
        BaseTest<P1168Test, SolutionRecord> baseTest = new BaseTest<>(P1168Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("minCostToSupplyWater")
    @ParameterizedTest(name = "{0}: n = {1}, wells = {2}, pipes = {3}, output = {4}")
    @MethodSource
    void minCostToSupplyWater(String message, int n, int[] wells, int[][] pipes, int output) {
        P1168 p1168 = new P1168();
        int actual = p1168.minCostToSupplyWater(n, wells, pipes);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int n, int[] wells, int[][] pipes, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.n, s.wells, s.pipes, s.output);
        }
    }
}