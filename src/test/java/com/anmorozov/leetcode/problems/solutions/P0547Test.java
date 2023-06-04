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

@DisplayName("547. Number of Provinces.")
class P0547Test {

    static Stream<Arguments> findCircleNum() throws IOException {
        BaseTest<P0547Test, SolutionRecord> baseTest = new BaseTest<>(P0547Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("findCircleNum")
    @ParameterizedTest(name = "{0}: isConnected = {1}, output = {2}")
    @MethodSource
    void findCircleNum(String message, int[][] isConnected, int output) {
        P0547 p0547 = new P0547();
        int actual = p0547.findCircleNum(isConnected);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[][] isConnected, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.isConnected, s.output);
        }
    }

}