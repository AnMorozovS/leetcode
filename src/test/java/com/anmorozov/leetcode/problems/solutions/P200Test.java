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

class P200Test {

    private static List<Arguments> testCases;

    @BeforeAll
    static void beforeAll() throws IOException {
        BaseTest<P200Test, SolutionRecord> baseTest = new BaseTest<>(P200Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        testCases = baseTest.prepare();

    }

    static Stream<Arguments> numIslands() {
        return testCases.stream();
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource
    void numIslands(String message, char[][] grid, int output) {
        P200 p200 = new P200();
        int actual = p200.numIslands(grid);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, char[][] grid, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.grid, s.output);
        }
    }
}