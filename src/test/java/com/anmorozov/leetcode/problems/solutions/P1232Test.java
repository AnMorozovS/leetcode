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

@DisplayName("1232. Check If It Is a Straight Line.")
class P1232Test {

    static Stream<Arguments> checkStraightLine() throws IOException {
        BaseTest<P1232Test, SolutionRecord> baseTest = new BaseTest<>(P1232Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("checkStraightLine")
    @ParameterizedTest(name = "{0}: coordinates = {1}, output = {2}")
    @MethodSource
    void checkStraightLine(String message, int[][] coordinates, boolean output) {
        P1232 p1232 = new P1232();
        boolean actual = p1232.checkStraightLine(coordinates);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[][] coordinates, boolean output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.coordinates, s.output);
        }
    }

}