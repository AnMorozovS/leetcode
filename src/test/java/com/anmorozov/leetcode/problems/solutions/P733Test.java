package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P733Test {

    private static List<Arguments> testCases;

    @BeforeAll
    static void beforeAll() throws IOException {
        BaseTest<P733Test, SolutionRecord> baseTest = new BaseTest<>(P733Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        testCases = baseTest.prepare();

    }

    static Stream<Arguments> floodFill() {
        return testCases.stream();
    }

    @ParameterizedTest(name = "{0} [{2}][{3}] -> {4}")
    @MethodSource
    void floodFill(String message, int[][] image, int sr, int sc, int color, int[][] output) {
        Arrays.stream(image).forEach(x -> System.out.println(Arrays.toString(x)));
        P733 p733 = new P733();
        int[][] actual = p733.floodFill(image, sr, sc, color);
        assertArrayEquals(output, actual);
    }

    record SolutionRecord(String message, int[][] image, int sr, int sc, int color, int[][] output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.image, s.sr, s.sc, s.color, s.output);
        }
    }
}