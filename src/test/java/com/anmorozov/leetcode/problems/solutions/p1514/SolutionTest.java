package com.anmorozov.leetcode.problems.solutions.p1514;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("1514. Path with Maximum Probability.")
class SolutionTest {

    static Stream<Arguments> maxProbability() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach2.maxProbability")
    @ParameterizedTest(name = "{0}: n = {1}, edges = {2}, succProb = {3}, start = {4}, end = {5}, output = {6}")
    @MethodSource("maxProbability")
    void testMyApproach2(String message, int n, int[][] edges, double[] succProb, int start, int end, double output) {
        Solution solution = new MyApproach2();
        double actual = solution.maxProbability(n, edges, succProb, start, end);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach1.maxProbability")
    @ParameterizedTest(name = "{0}: n = {1}, edges = {2}, succProb = {3}, start = {4}, end = {5}, output = {6}")
    @MethodSource("maxProbability")
    void testApproach1(String message, int n, int[][] edges, double[] succProb, int start, int end, double output) {
        Solution solution = new Approach1();
        double actual = solution.maxProbability(n, edges, succProb, start, end);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach2.maxProbability")
    @ParameterizedTest(name = "{0}: n = {1}, edges = {2}, succProb = {3}, start = {4}, end = {5}, output = {6}")
    @MethodSource("maxProbability")
    void testApproach2(String message, int n, int[][] edges, double[] succProb, int start, int end, double output) {
        Solution solution = new Approach2();
        double actual = solution.maxProbability(n, edges, succProb, start, end);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

}