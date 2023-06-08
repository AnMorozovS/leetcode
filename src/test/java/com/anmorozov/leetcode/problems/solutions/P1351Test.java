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

@DisplayName("1351. Count Negative Numbers in a Sorted Matrix.")
class P1351Test {

    static Stream<Arguments> countNegatives() throws IOException {
        BaseTest<P1351Test, SolutionRecord> baseTest = new BaseTest<>(P1351Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("countNegatives")
    @ParameterizedTest(name = "{0}: grid = {1}, output = {2}")
    @MethodSource
    void countNegatives(String message, int[][] grid, int output) {
        P1351 p1351 = new P1351();
        int actual = p1351.countNegatives(grid);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[][] grid, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.grid, s.output);
        }
    }

}