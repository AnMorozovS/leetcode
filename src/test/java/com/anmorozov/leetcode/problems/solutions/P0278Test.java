package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0278Test {

    static Stream<Arguments> firstBadVersion() throws IOException {
        BaseTest<P0278Test, SolutionRecord> baseTest = new BaseTest<>(P0278Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @ParameterizedTest(name = "n = {1}, bad = {2}")
    @MethodSource
    void firstBadVersion(String message, int n, int bad, int output) {
        P0278 p0278 = new P0278(bad);
        int actual = p0278.firstBadVersion(n);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int n, int bad, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.n, s.bad, s.output);
        }
    }
}