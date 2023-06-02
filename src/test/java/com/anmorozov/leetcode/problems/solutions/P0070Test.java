package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
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

class P0070Test {


    private static List<Arguments> testCases;

    @BeforeAll
    static void beforeAll() throws IOException {
        BaseTest<P0070Test, SolutionRecord> baseTest = new BaseTest<>(P0070Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        testCases = baseTest.prepare();

    }

    static Stream<Arguments> climbStairs() {
        return testCases.stream();
    }

    @ParameterizedTest(name = "{0}")
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