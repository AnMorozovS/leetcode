package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1091. Shortest Path in Binary Matrix.")
class P1091Test {

    private static List<Arguments> testCases;

    @BeforeAll
    static void beforeAll() throws IOException {
        BaseTest<P1091Test, SolutionRecord> baseTest = new BaseTest<>(P1091Test.class, new TypeReference<>() {
        }, P1091Test.SolutionRecord::getArguments);
        testCases = baseTest.prepare();

    }

    static Stream<Arguments> shortestPathBinaryMatrix() {
        return testCases.stream();
    }

    @ParameterizedTest(name = "{0}: output = {2}, grid = {1} ")
    @MethodSource
    void shortestPathBinaryMatrix(String message, int[][] grid, int output) {
        P1091 p1091 = new P1091();
        int actual = p1091.shortestPathBinaryMatrix(grid);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[][] grid, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.grid, s.output);
        }
    }
}