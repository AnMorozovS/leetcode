package com.anmorozov.leetcode.problems.solutions.p1129;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("1129. Shortest Path with Alternating Colors.")
class SolutionTest {

    static Stream<Arguments> shortestAlternatingPaths() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1 : of Breadth First Search")
    @ParameterizedTest(name = "{0}: n = {1}, redEdges = {2}, blueEdges = {3}, output = {4}")
    @MethodSource("shortestAlternatingPaths")
    void testMyApproach1(String message, int n, int[][] redEdges, int[][] blueEdges, int[] output) {
        Solution solution = new MyApproach1();
        int[] actual = solution.shortestAlternatingPaths(n, redEdges, blueEdges);
        assertArrayEquals(output, actual);
    }

    @DisplayName("Approach: Breadth First Search")
    @ParameterizedTest(name = "{0}: n = {1}, redEdges = {2}, blueEdges = {3}, output = {4}")
    @MethodSource("shortestAlternatingPaths")
    void testApproach1(String message, int n, int[][] redEdges, int[][] blueEdges, int[] output) {
        Solution solution = new Approach1();
        int[] actual = solution.shortestAlternatingPaths(n, redEdges, blueEdges);
        assertArrayEquals(output, actual);
    }
}