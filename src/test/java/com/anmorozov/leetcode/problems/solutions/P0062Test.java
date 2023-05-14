package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.problems.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0062Test {

    private static List<Arguments> testCases;

    @BeforeAll
    static void beforeAll() throws IOException {
        BaseTest<P0062Test, SolutionRecord> baseTest = new BaseTest<>(P0062Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        testCases = baseTest.prepare();

    }

    static Stream<Arguments> uniquePaths() {
        return testCases.stream();
    }

    @ParameterizedTest(name = "{0} m = {1} n = {2} ")
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