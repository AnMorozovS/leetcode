package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1146. Snapshot Array.")
class P1146Test {

    static Stream<Arguments> useSnapshotArray() throws IOException {
        BaseTest<P1146Test, SolutionRecord> baseTest = new BaseTest<>(P1146Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("useSnapshotArray")
    @ParameterizedTest(name = "{0}: commands = {1}, parametersList = {2}, output = {3}")
    @MethodSource
    void useSnapshotArray(String message, String[] commands, int[][] parametersList, Integer[] output) {
        P1146 p1146 = new P1146();
        Integer[] actual = p1146.useSnapshotArray(commands, parametersList);
        assertArrayEquals(actual, output);
    }


    record SolutionRecord(String message, String[] commands, int[][] parametersList, Integer[] output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.commands, s.parametersList, s.output);
        }
    }
}