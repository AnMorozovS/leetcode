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

@DisplayName("62. Unique Paths.")
class P0062Test {

    static Stream<Arguments> uniquePaths() throws IOException {
        BaseTest<P0062Test, SolutionRecord> baseTest = new BaseTest<>(P0062Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @ParameterizedTest(name = "{0}: m = {1}, n = {2}, output = {3}")
    @MethodSource
    void uniquePaths(String message, int m, int n, int output) {
        P0062 p0062 = new P0062();
        int actual = p0062.uniquePaths(m, n);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int m, int n, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.m, s.n, s.output);
        }
    }
}