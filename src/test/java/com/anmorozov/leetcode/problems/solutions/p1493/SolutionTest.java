package com.anmorozov.leetcode.problems.solutions.p1493;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("1493. Longest Subarray of 1's After Deleting One Element.")
class SolutionTest {

    static Stream<Arguments> longestSubarray() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1.longestSubarray")
    @ParameterizedTest(name = "{0}: nums = {1}, output = {2}")
    @MethodSource("longestSubarray")
    void testMyApproach1(String message, int[] nums, int output) {

        Solution solution = new MyApproach1();
        int actual = solution.longestSubarray(nums);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach: Sliding Window")
    @ParameterizedTest(name = "{0}: nums = {1}, output = {2}")
    @MethodSource("longestSubarray")
    void testApproach1(String message, int[] nums, int output) {

        Solution solution = new Approach1();
        int actual = solution.longestSubarray(nums);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}