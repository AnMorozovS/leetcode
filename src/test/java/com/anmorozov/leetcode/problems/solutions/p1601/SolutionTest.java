package com.anmorozov.leetcode.problems.solutions.p1601;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("1601. Maximum Number of Achievable Transfer Requests.")
class SolutionTest {

    static Stream<Arguments> maximumRequests() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1")
    @ParameterizedTest(name = "{0}: n = {1}, requests = {2}, output = {3}")
    @MethodSource("maximumRequests")
    void testMyApproach1(String message, int n, int[][] requests, int output) {

        Solution solution = new MyApproach1();
        long actual = solution.maximumRequests(n, requests);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: Backtracking")
    @ParameterizedTest(name = "{0}: n = {1}, requests = {2}, output = {3}")
    @MethodSource("maximumRequests")
    void testApproach1(String message, int n, int[][] requests, int output) {

        Solution solution = new Approach1();
        long actual = solution.maximumRequests(n, requests);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 2: BitMasking")
    @ParameterizedTest(name = "{0}: n = {1}, requests = {2}, output = {3}")
    @MethodSource("maximumRequests")
    void testApproach2(String message, int n, int[][] requests, int output) {

        Solution solution = new Approach2();
        long actual = solution.maximumRequests(n, requests);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

}