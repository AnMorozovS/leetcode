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

class P278Test {

    private static List<Arguments> testCases;

    @BeforeAll
    static void beforeAll() throws IOException {
        BaseTest<P278Test, SolutionRecord> baseTest = new BaseTest<>(P278Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        testCases = baseTest.prepare();

    }

    static Stream<Arguments> firstBadVersion() {
        return testCases.stream();
    }

    @ParameterizedTest(name = "n = {1}, bad = {2}")
    @MethodSource
    void firstBadVersion(String message, int n, int bad, int output) {
        P278 p278 = new P278(bad);
        int actual = p278.firstBadVersion(n);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int n, int bad, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.n, s.bad, s.output);
        }
    }
}