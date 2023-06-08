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

@DisplayName("1318. Minimum Flips to Make a OR b Equal to c.")
class P1318Test {

    static Stream<Arguments> minFlips() throws IOException {
        BaseTest<P1318Test, SolutionRecord> baseTest = new BaseTest<>(P1318Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("minFlips")
    @ParameterizedTest(name = "{0}: a = {1}, b = {2}, c = {3}, output = {4}")
    @MethodSource
    void minFlips(String message, int a, int b, int c, int output) {
        P1318 p1318 = new P1318();
        int actual = p1318.minFlips(a, b, c);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int a, int b, int c, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.a, s.b, s.c, s.output);
        }
    }

}