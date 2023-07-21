package com.anmorozov.leetcode.problems.solutions.p0994;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("994. Rotting Oranges.")
class SolutionTest {

    static Stream<Arguments> orangesRotting() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1 orangesRotting")
    @ParameterizedTest(name = "{0}, grid = {1}, output = {2}")
    @MethodSource("orangesRotting")
    void testMyApproach1(String message, int[][] grid, int output) {

        Solution solution = new MyApproach1();
        int actual = solution.orangesRotting(grid);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: Breadth-First Search (BFS)")
    @ParameterizedTest(name = "{0}, grid = {1}, output = {2}")
    @MethodSource("orangesRotting")
    void testApproach1(String message, int[][] grid, int output) {

        Solution solution = new Approach1();
        int actual = solution.orangesRotting(grid);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 2: In-place BFS")
    @ParameterizedTest(name = "{0}, grid = {1}, output = {2}")
    @MethodSource("orangesRotting")
    void testApproach2(String message, int[][] grid, int output) {

        Solution solution = new Approach2();
        int actual = solution.orangesRotting(grid);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}