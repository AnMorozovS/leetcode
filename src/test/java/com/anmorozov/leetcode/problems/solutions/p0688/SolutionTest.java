package com.anmorozov.leetcode.problems.solutions.p0688;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("688. Knight Probability in Chessboard.")
class SolutionTest {

    static Stream<Arguments> knightProbability() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1: Recursion with cache")
    @ParameterizedTest(name = "{0}: n = {1}, k = {2}, row = {3}, column = {4}, output = {5}")
    @MethodSource("knightProbability")
    void testMyApproach1(String message, int n, int k, int row, int column, double output) {

        Solution solution = new MyApproach1();
        double actual = solution.knightProbability(n, k, row, column);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: Bottom-up Dynamic Programming")
    @ParameterizedTest(name = "{0}: n = {1}, k = {2}, row = {3}, column = {4}, output = {5}")
    @MethodSource("knightProbability")
    void testApproach1(String message, int n, int k, int row, int column, double output) {

        Solution solution = new Approach1();
        double actual = solution.knightProbability(n, k, row, column);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 2: Bottom-up Dynamic Programming with Optimized Space Complexity")
    @ParameterizedTest(name = "{0}: n = {1}, k = {2}, row = {3}, column = {4}, output = {5}")
    @MethodSource("knightProbability")
    void testApproach2(String message, int n, int k, int row, int column, double output) {

        Solution solution = new Approach2();
        double actual = solution.knightProbability(n, k, row, column);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 3: Top-down Dynamic Programming (Memoization)")
    @ParameterizedTest(name = "{0}: n = {1}, k = {2}, row = {3}, column = {4}, output = {5}")
    @MethodSource("knightProbability")
    void testApproach3(String message, int n, int k, int row, int column, double output) {

        Solution solution = new Approach3();
        double actual = solution.knightProbability(n, k, row, column);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}