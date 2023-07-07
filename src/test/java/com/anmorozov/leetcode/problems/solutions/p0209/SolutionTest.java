package com.anmorozov.leetcode.problems.solutions.p0209;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("209. Minimum Size Subarray Sum.")
class SolutionTest {

    static Stream<Arguments> minSubArrayLen() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1")
    @ParameterizedTest(name = "{0}: target = {1}, nums = {2}, output = {3}")
    @MethodSource("minSubArrayLen")
    void testMyApproach1(String message, int target, int[] nums, int output) {

        Solution solution = new MyApproach1();
        int actual = solution.minSubArrayLen(target, nums);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: Sliding Window")
    @ParameterizedTest(name = "{0}: target = {1}, nums = {2}, output = {3}")
    @MethodSource("minSubArrayLen")
    void testApproach1(String message, int target, int[] nums, int output) {

        Solution solution = new Approach1();
        int actual = solution.minSubArrayLen(target, nums);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}