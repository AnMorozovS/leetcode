package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0733Test {

    static Stream<Arguments> floodFill() throws IOException {
        BaseTest<P0733Test, SolutionRecord> baseTest = new BaseTest<>(P0733Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @ParameterizedTest(name = "{0} [{2}][{3}] -> {4}")
    @MethodSource
    void floodFill(String message, int[][] image, int sr, int sc, int color, int[][] output) {
        P0733 p0733 = new P0733();
        int[][] actual = p0733.floodFill(image, sr, sc, color);
        assertArrayEquals(output, actual);
    }

    record SolutionRecord(String message, int[][] image, int sr, int sc, int color, int[][] output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.image, s.sr, s.sc, s.color, s.output);
        }
    }
}