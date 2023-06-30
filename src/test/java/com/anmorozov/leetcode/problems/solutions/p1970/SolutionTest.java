package com.anmorozov.leetcode.problems.solutions.p1970;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("1970. Last Day Where You Can Still Cross Hard.")
class SolutionTest {

    static Stream<Arguments> latestDayToCross() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1 with union find")
    @ParameterizedTest(name = "{0}: row = {1}, col = {2}, cells = {3}, output = {4}")
    @MethodSource("latestDayToCross")
    void testMyApproach1(String message, int row, int col, int[][] cells, int output) {
        Solution solution = new MyApproach1();
        int actual = solution.latestDayToCross(row, col, cells);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}