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

class P509Test {

    private static List<Arguments> testCases;

    @BeforeAll
    static void beforeAll() throws IOException {
        BaseTest<P509Test, SolutionRecord> baseTest = new BaseTest<>(P509Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        testCases = baseTest.prepare();

    }

    static Stream<Arguments> fib() {
        return testCases.stream();
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource
    void fib(String message, int n, int output) {
        P509 p509 = new P509();
        int actual = p509.fib(n);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int n, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.n, s.output);
        }
    }
}