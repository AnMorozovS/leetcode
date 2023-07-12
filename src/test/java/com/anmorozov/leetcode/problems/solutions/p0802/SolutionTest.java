package com.anmorozov.leetcode.problems.solutions.p0802;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("802. Find Eventual Safe States.")
class SolutionTest {

    static Stream<Arguments> eventualSafeNodes() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1: Brute force with cash result.")
    @ParameterizedTest(name = "{0}: graph = {1}, output = {2}")
    @MethodSource("eventualSafeNodes")
    void testMyApproach1(String message, int[][] graph, List<Integer> output) {

        Solution solution = new MyApproach1();
        List<Integer> actual = solution.eventualSafeNodes(graph);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: Topological Sort Using Kahn's Algorithm.")
    @ParameterizedTest(name = "{0}: graph = {1}, output = {2}")
    @MethodSource("eventualSafeNodes")
    void testApproach1(String message, int[][] graph, List<Integer> output) {

        Solution solution = new Approach1();
        List<Integer> actual = solution.eventualSafeNodes(graph);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 2: Depth First Search.")
    @ParameterizedTest(name = "{0}: graph = {1}, output = {2}")
    @MethodSource("eventualSafeNodes")
    void testApproach2(String message, int[][] graph, List<Integer> output) {

        Solution solution = new Approach2();
        List<Integer> actual = solution.eventualSafeNodes(graph);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}