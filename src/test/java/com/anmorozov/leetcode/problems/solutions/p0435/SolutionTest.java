package com.anmorozov.leetcode.problems.solutions.p0435;

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

@DisplayName("435. Non-overlapping Intervals.")
class SolutionTest {

    static Stream<Arguments> eraseOverlapIntervals() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1 common solution by deleting edges")
    @ParameterizedTest(name = "{0}: intervals = {1}, output = {2}")
    @MethodSource("eraseOverlapIntervals")
    @Disabled("Because this task awful")
    void testMyApproach1(String message, int[][] intervals, int output) {

        Solution solution = new MyApproach1();
        int actual = solution.eraseOverlapIntervals(intervals);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach1")
    @ParameterizedTest(name = "{0}: intervals = {1}, output = {2}")
    @MethodSource("eraseOverlapIntervals")
    void testApproach1(String message, int[][] intervals, int output) {

        Solution solution = new Approach1();
        int actual = solution.eraseOverlapIntervals(intervals);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}