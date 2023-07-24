package com.anmorozov.leetcode.problems.solutions.p0787;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("787. Cheapest Flights Within K Stops.")
class SolutionTest {

    static Stream<Arguments> findCheapestPrice() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1: use Bellman Ford Algorithm.")
    @ParameterizedTest(name = "{0}: n = {1}, flights = {2}, src = {3}, dst = {4}, k = {5}, output = {6}")
    @MethodSource("findCheapestPrice")
    void testMyApproach1(String message, int n, int[][] flights, int src, int dst, int k, int output) {

        Solution solution = new MyApproach1();
        int actual = solution.findCheapestPrice(n, flights, src, dst, k);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: Bellman Ford Algorithm.")
    @ParameterizedTest(name = "{0}: n = {1}, flights = {2}, src = {3}, dst = {4}, k = {5}, output = {6}")
    @MethodSource("findCheapestPrice")
    void testApproach1(String message, int n, int[][] flights, int src, int dst, int k, int output) {

        Solution solution = new Approach1();
        int actual = solution.findCheapestPrice(n, flights, src, dst, k);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}