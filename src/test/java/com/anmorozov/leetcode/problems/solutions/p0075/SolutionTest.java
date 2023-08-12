package com.anmorozov.leetcode.problems.solutions.p0075;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("75. Sort Colors.")
class SolutionTest {

    static Stream<Arguments> sortColors() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }
    @DisplayName("My Approach 1 : Selection Sort")
    @ParameterizedTest(name = "{0}, nums = {1}, output = {2}")
    @MethodSource("sortColors")
    void testMyApproach1(String ignoredMessage, int[] nums, int[] output) {
        Solution solution = new MyApproach1();
        int[] actual = solution.sortColors(nums);
        assertArrayEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("My Approach 2 : Selection Sort")
    @ParameterizedTest(name = "{0}, nums = {1}, output = {2}")
    @MethodSource("sortColors")
    void testMyApproach2(String ignoredMessage, int[] nums, int[] output) {
        Solution solution = new MyApproach2();
        int[] actual = solution.sortColors(nums);
        assertArrayEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: One Pass")
    @ParameterizedTest(name = "{0}, nums = {1}, output = {2}")
    @MethodSource("sortColors")
    void testApproach1(String ignoredMessage, int[] nums, int[] output) {
        Solution solution = new Approach1();
        int[] actual = solution.sortColors(nums);
        assertArrayEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}