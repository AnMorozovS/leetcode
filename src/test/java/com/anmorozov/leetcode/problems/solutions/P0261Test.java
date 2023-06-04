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

@DisplayName("261. Graph Valid Tree.")
class P0261Test {

    static Stream<Arguments> validTree() throws IOException {
        BaseTest<P0261Test, SolutionRecord> baseTest = new BaseTest<>(P0261Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("validTree")
    @ParameterizedTest(name = "{0}: n = {1}, edges = {2}, output = {3}")
    @MethodSource
    void validTree(String message, int n, int[][] edges, boolean output) {
        P0261 p0261 = new P0261();
        boolean actual = p0261.validTree(n, edges);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int n, int[][] edges, boolean output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.n, s.edges, s.output);
        }
    }
}