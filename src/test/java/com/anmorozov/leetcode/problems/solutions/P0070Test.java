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

@DisplayName("70. Climbing Stairs.")
class P0070Test {

    static Stream<Arguments> climbStairs() throws IOException {
        BaseTest<P0070Test, SolutionRecord> baseTest = new BaseTest<>(P0070Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("climbStairs")
    @ParameterizedTest(name = "{0}: n = {1}, output = {2}")
    @MethodSource
    void climbStairs(String message, int n, int output) {
        P0070 p0070 = new P0070();
        int actual = p0070.climbStairs(n);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int n, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.n, s.output);
        }
    }
}