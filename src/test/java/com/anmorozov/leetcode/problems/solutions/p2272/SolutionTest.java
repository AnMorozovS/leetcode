package com.anmorozov.leetcode.problems.solutions.p2272;

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

@DisplayName("2272. Substring With Largest Variance.")
class SolutionTest {

    static Stream<Arguments> largestVariance() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1 use cash based on String")
    @ParameterizedTest(name = "{0}: s = {1}, output = {2}")
    @MethodSource("largestVariance")
    @Disabled("too long execution time")
    void testMyApproach1(String message, String s, int output) {

        Solution solution = new MyApproach1();
        int actual = solution.largestVariance(s);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: Kadane's Algorithm")
    @ParameterizedTest(name = "{0}: s = {1}, output = {2}")
    @MethodSource("largestVariance")
    void testApproach1(String message, String s, int output) {

        Solution solution = new Approach1();
        int actual = solution.largestVariance(s);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}