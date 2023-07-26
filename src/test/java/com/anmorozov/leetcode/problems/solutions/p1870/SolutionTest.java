package com.anmorozov.leetcode.problems.solutions.p1870;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("1870. Minimum Speed to Arrive on Time.")
class SolutionTest {

    static Stream<Arguments> minSpeedOnTime() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1:")
    @ParameterizedTest(name = "{0}: dist = {1}, hour = {2}, output = {3}")
    @MethodSource("minSpeedOnTime")
    void testMyApproach1(String message, int[] dist, double hour, int output) {

        Solution solution = new MyApproach1();
        int actual = solution.minSpeedOnTime(dist, hour);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}