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

@DisplayName("1732. Find the Highest Altitude.")
class P1732Test {

    static Stream<Arguments> largestAltitude() throws IOException {
        BaseTest<P1732Test, SolutionRecord> baseTest = new BaseTest<>(P1732Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("largestAltitude")
    @ParameterizedTest(name = "{0}: gain = {1}, output = {2}")
    @MethodSource
    void largestAltitude(String message, int[] gain, int output) {
        P1732 p1732 = new P1732();
        int actual = p1732.largestAltitude(gain);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] gain, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.gain, s.output);
        }
    }

}