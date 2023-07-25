package com.anmorozov.leetcode.problems.solutions.p0852;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("852. Peak Index in a Mountain Array.")
class SolutionTest {

    static Stream<Arguments> peakIndexInMountainArray() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1: Binary Search")
    @ParameterizedTest(name = "{0}: arr = {1}, output = {2}")
    @MethodSource("peakIndexInMountainArray")
    void testMyApproach1(String message, int[] arr, int output) {

        Solution solution = new MyApproach1();
        int actual = solution.peakIndexInMountainArray(arr);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 2: Binary Search")
    @ParameterizedTest(name = "{0}: arr = {1}, output = {2}")
    @MethodSource("peakIndexInMountainArray")
    void testMyApproach2(String message, int[] arr, int output) {

        Solution solution = new Approach2();
        int actual = solution.peakIndexInMountainArray(arr);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}