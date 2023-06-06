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

@DisplayName("1502. Can Make Arithmetic Progression From Sequence.")
class P1502Test {

    static Stream<Arguments> canMakeArithmeticProgression() throws IOException {
        BaseTest<P1502Test, SolutionRecord> baseTest = new BaseTest<>(P1502Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("canMakeArithmeticProgression")
    @ParameterizedTest(name = "{0}: arr = {1}, output = {2}")
    @MethodSource
    void canMakeArithmeticProgression(String message, int[] arr, boolean output) {
        P1502 p1168 = new P1502();
        boolean actual = p1168.canMakeArithmeticProgression(arr);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] arr, boolean output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.arr, s.output);
        }
    }
}