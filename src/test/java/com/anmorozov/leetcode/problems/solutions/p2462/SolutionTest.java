package com.anmorozov.leetcode.problems.solutions.p2462;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("2462. Total Cost to Hire K Workers")
class SolutionTest {

    static Stream<Arguments> totalCost() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1.totalCost")
    @ParameterizedTest(name = "{0}: costs = {1}, k = {2}, candidates = {3}, output = {4}")
    @MethodSource("totalCost")
    void testMyApproach1(String message, int[] costs, int k, int candidates, long output) {

        Solution solution = new MyApproach1();
        long actual = solution.totalCost(costs, k, candidates);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach1.totalCost")
    @ParameterizedTest(name = "{0}: costs = {1}, k = {2}, candidates = {3}, output = {4}")
    @MethodSource("totalCost")
    void testApproach1(String message, int[] costs, int k, int candidates, long output) {

        Solution solution = new Approach1();
        long actual = solution.totalCost(costs, k, candidates);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());

        solution = new Approach2();
        actual = solution.totalCost(costs, k, candidates);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach2.totalCost")
    @ParameterizedTest(name = "{0}: costs = {1}, k = {2}, candidates = {3}, output = {4}")
    @MethodSource("totalCost")
    void testApproach2(String message, int[] costs, int k, int candidates, long output) {

        Solution solution = new Approach2();
        long actual = solution.totalCost(costs, k, candidates);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

}