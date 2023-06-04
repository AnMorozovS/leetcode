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

@DisplayName("1101. The Earliest Moment When Everyone Become Friends.")
class P1101Test {

    static Stream<Arguments> earliestAcq() throws IOException {
        BaseTest<P1101Test, SolutionRecord> baseTest = new BaseTest<>(P1101Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("earliestAcq")
    @ParameterizedTest(name = "{0}: logs = {1}, n = {2}, output = {3}")
    @MethodSource
    void earliestAcq(String message, int[][] logs, int n, int output) {
        P1101 p1101 = new P1101();
        int actual = p1101.earliestAcq(logs, n);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[][] logs, int n, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.logs, s.n, s.output);
        }
    }
}