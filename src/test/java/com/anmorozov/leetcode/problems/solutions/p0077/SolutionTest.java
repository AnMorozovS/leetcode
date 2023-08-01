package com.anmorozov.leetcode.problems.solutions.p0077;

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

@DisplayName("77. Combinations.")
class SolutionTest {

    static Stream<Arguments> combine() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1 : recursion")
    @ParameterizedTest(name = "{0}, n = {1}, k = {2}, output = {3}")
    @MethodSource("combine")
    void testMyApproach1(String ignoredMessage, int n, int k, List<List<Integer>> output) {
        Solution solution = new MyApproach1();
        List<List<Integer>> actual = solution.combine(n, k);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: Backtracking")
    @ParameterizedTest(name = "{0}, n = {1}, k = {2}, output = {3}")
    @MethodSource("combine")
    void testApproach1(String ignoredMessage, int n, int k, List<List<Integer>> output) {
        Solution solution = new Approach1();
        List<List<Integer>> actual = solution.combine(n, k);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}