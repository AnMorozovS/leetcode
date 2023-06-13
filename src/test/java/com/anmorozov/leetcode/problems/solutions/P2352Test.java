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

@DisplayName("2352. Equal Row and Column Pairs.")
class P2352Test {

    static Stream<Arguments> equalPairs() throws IOException {
        BaseTest<P2352Test, SolutionRecord> baseTest = new BaseTest<>(P2352Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("equalPairs")
    @ParameterizedTest(name = "{0}: grid = {1}, output = {2} ")
    @MethodSource
    void equalPairs(String message, int[][] grid, int output) {
        P2352 p2352 = new P2352();
        int actual = p2352.equalPairs(grid);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[][] grid, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.grid, s.output);
        }
    }
}