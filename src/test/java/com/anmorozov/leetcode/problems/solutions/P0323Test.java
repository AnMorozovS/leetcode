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

@DisplayName("323. Number of Connected Components in an Undirected Graph")
class P0323Test {

    static Stream<Arguments> countComponents() throws IOException {
        BaseTest<P0323Test, SolutionRecord> baseTest = new BaseTest<>(P0323Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("countComponents")
    @ParameterizedTest(name = "{0}: n = {1}, edges = {2}, output = {3}")
    @MethodSource
    void countComponents(String message, int n, int[][] edges, int output) {
        P0323 p0323 = new P0323();
        int actual = p0323.countComponents(n, edges);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int n, int[][] edges, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.n, s.edges, s.output);
        }
    }

}