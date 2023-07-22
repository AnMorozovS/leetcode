package com.anmorozov.leetcode.problems.solutions.p0743;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("743. Network Delay Time.")
class SolutionTest {

    static Stream<Arguments> networkDelayTime() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My approach: Dijkstra's Algorithm")
    @ParameterizedTest(name = "{0}: times = {1}, n = {2}, k = {3}, output = {4}")
    @MethodSource("networkDelayTime")
    void testMyApproach1(String message, int[][] times, int n, int k, int output) {

        Solution solution = new MyApproach1();
        int actual = solution.networkDelayTime(times, n, k);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 3: Dijkstra's Algorithm")
    @ParameterizedTest(name = "{0}: times = {1}, n = {2}, k = {3}, output = {4}")
    @MethodSource("networkDelayTime")
    void testApproach3(String message, int[][] times, int n, int k, int output) {

        Solution solution = new Approach3();
        int actual = solution.networkDelayTime(times, n, k);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}