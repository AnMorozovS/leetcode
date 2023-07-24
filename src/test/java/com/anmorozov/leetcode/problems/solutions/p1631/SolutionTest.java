package com.anmorozov.leetcode.problems.solutions.p1631;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("1631. Path With Minimum Effort.")
class SolutionTest {

    static Stream<Arguments> minimumEffortPath() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1: SPFA Algorithm")
    @ParameterizedTest(name = "{0}: heights = {1}, output = {2}")
    @MethodSource("minimumEffortPath")
    void testMyApproach1(String message, int[][] heights, int output) {

        Solution solution = new MyApproach1();
        int actual = solution.minimumEffortPath(heights);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 2: Variations of Dijkstra's Algorithm")
    @ParameterizedTest(name = "{0}: heights = {1}, output = {2}")
    @MethodSource("minimumEffortPath")
    void testApproach2(String message, int[][] heights, int output) {

        Solution solution = new Approach2();
        int actual = solution.minimumEffortPath(heights);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}