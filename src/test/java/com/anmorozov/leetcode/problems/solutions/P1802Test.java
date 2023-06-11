package com.anmorozov.leetcode.problems.solutions;

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

@DisplayName("1802. Maximum Value at a Given Index in a Bounded Array.")
class P1802Test {

    static Stream<Arguments> maxValue() throws IOException {
        BaseTest<P1802Test, P1802Test.SolutionRecord> baseTest = new BaseTest<>(P1802Test.class, new TypeReference<>() {
        }, P1802Test.SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("maxValue")
    @ParameterizedTest(name = "{0}: n = {1}, index = {2}, maxSum = {3}, output = {4} ")
    @MethodSource
    void maxValue(String message, int n, int index, int maxSum, int output) {
        P1802 p1802 = new P1802();
        int actual = p1802.maxValue(n, index, maxSum);
        assertEquals(output, actual);
    }


    record SolutionRecord(String message, int n, int index, int maxSum, int output) {

        public static Arguments getArguments(P1802Test.SolutionRecord s) {
            return arguments(s.message, s.n, s.index, s.maxSum, s.output);
        }
    }
}