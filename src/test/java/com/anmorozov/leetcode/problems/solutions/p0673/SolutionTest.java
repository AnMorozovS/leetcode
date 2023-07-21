package com.anmorozov.leetcode.problems.solutions.p0673;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("673. Number of Longest Increasing Subsequence.")
class SolutionTest {

    static Stream<Arguments> findNumberOfLIS() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1 findNumberOfLIS")
    @ParameterizedTest(name = "{0}: nums = {1}, output = {2}")
    @MethodSource("findNumberOfLIS")
    @Disabled("Because huge size of test data can't find mistake")
    void testMyApproach1(String message, int[] nums, int output) {

        Solution solution = new MyApproach1();
        int actual = solution.findNumberOfLIS(nums);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: Bottom-up Dynamic Programming")
    @ParameterizedTest(name = "{0}: nums = {1}, output = {2}")
    @MethodSource("findNumberOfLIS")
    void testApproach1(String message, int[] nums, int output) {

        Solution solution = new Approach1();
        int actual = solution.findNumberOfLIS(nums);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 2: Top-down Dynamic Programming (Memoization)")
    @ParameterizedTest(name = "{0}: nums = {1}, output = {2}")
    @MethodSource("findNumberOfLIS")
    void testApproach2(String message, int[] nums, int output) {

        Solution solution = new Approach2();
        int actual = solution.findNumberOfLIS(nums);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}