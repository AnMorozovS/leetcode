package com.anmorozov.leetcode.problems.solutions.p0465;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("465. Optimal Account Balancing.")
class SolutionTest {

    static Stream<Arguments> minTransfers() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("Approach 1: Backtracking")
    @ParameterizedTest(name = "{0}: transactions = {1}, output = {2}")
    @MethodSource("minTransfers")
    void testApproach1(String message, int[][] transactions, int output) {

        Solution solution = new Approach1();
        int actual = solution.minTransfers(transactions);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 2: Dynamic Programming")
    @ParameterizedTest(name = "{0}: transactions = {1}, output = {2}")
    @MethodSource("minTransfers")
    void testApproach2(String message, int[][] transactions, int output) {

        Solution solution = new Approach2();
        int actual = solution.minTransfers(transactions);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}