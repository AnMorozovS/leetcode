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

class P0200Test {

    static Stream<Arguments> numIslands() throws IOException {
        BaseTest<P0200Test, SolutionRecord> baseTest = new BaseTest<>(P0200Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource
    void numIslands(String message, char[][] grid, int output) {
        P0200 p0200 = new P0200();
        int actual = p0200.numIslands(grid);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, char[][] grid, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.grid, s.output);
        }
    }
}