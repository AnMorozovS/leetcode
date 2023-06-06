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

@DisplayName("1971. Find if Path Exists in Graph.")
class P1971Test {

    static Stream<Arguments> validPath() throws IOException {
        BaseTest<P1971Test, SolutionRecord> baseTest = new BaseTest<>(P1971Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("validPath")
    @ParameterizedTest(name = "{0}: n = {1}, edges = {2}, source = {3}, destination = {4}, output = {5}")
    @MethodSource
    void validPath(String message, int n, int[][] edges, int source, int destination, boolean output) {
        P1971 p1971 = new P1971();
        boolean actual = p1971.validPath(n, edges, source, destination);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int n, int[][] edges, int source, int destination, boolean output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.n, s.edges, s.source, s.destination, s.output);
        }
    }
}