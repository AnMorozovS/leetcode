package com.anmorozov.leetcode.problems.solutions.p0956;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("956. Tallest Billboard")
class SolutionTest {

    static Stream<Arguments> tallestBillboard() throws IOException {
        BaseTest<SolutionTest, SolutionTest.SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionTest.SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("tallestBillboard")
    @ParameterizedTest(name = "{0}: rods = {1}, output = {2}")
    @MethodSource
    void tallestBillboard(String message, int[] rods, int output) {
        Solution solution = new Approach2();
        int actual = solution.tallestBillboard(rods);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] rods, int output) {

        public static Arguments getArguments(
                SolutionTest.SolutionRecord s) {
            return arguments(s.message, s.rods, s.output);
        }
    }

}