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

@DisplayName("2328. Number of Increasing Paths in a Grid.")
class P2328Test {

    static Stream<Arguments> countPaths() throws IOException {
        BaseTest<P2328Test, SolutionRecord> baseTest = new BaseTest<>(P2328Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("countPaths")
    @ParameterizedTest(name = "{0}: grid = {1}, output = {2}")
    @MethodSource
    void countPaths(String message, int[][] grid, int output) {
        P2328 p2328 = new P2328();
        int actual = p2328.countPaths(grid);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[][] grid, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.grid, s.output);
        }
    }

}