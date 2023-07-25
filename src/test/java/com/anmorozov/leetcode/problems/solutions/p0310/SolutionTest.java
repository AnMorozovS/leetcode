package com.anmorozov.leetcode.problems.solutions.p0310;

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

@DisplayName("310. Minimum Height Trees")
class SolutionTest {

    static Stream<Arguments> findMinHeightTrees() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1")
    @ParameterizedTest(name = "{0}: n = {1}, edges = {2}, output = {3}")
    @MethodSource("findMinHeightTrees")
    void testMyApproach1(String message, int n, int[][] edges, List<Integer> output) {
        Solution solution = new MyApproach1();
        List<Integer> actual = solution.findMinHeightTrees(n, edges);
        assertEquals(output, actual);
    }

    @DisplayName("Approach 1: Topological Sorting")
    @ParameterizedTest(name = "{0}: n = {1}, edges = {2}, output = {3}")
    @MethodSource("findMinHeightTrees")
    void testApproach1(String message, int n, int[][] edges, List<Integer> output) {
        Solution solution = new Approach1();
        List<Integer> actual = solution.findMinHeightTrees(n, edges);
        assertEquals(output, actual);
    }
}