package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("797. All Paths From Source to Target.")
class P0797Test {

    static Stream<Arguments> allPathsSourceTarget() throws IOException {
        BaseTest<P0797Test, SolutionRecord> baseTest = new BaseTest<>(P0797Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("allPathsSourceTarget")
    @ParameterizedTest(name = "{0}: n = {1}, edges = {2}, source = {3}, destination = {4}, output = {5}")
    @MethodSource
    void allPathsSourceTarget(String message, int[][] graph, List<List<Integer>> output) {
        P0797 p0797 = new P0797();
        List<List<Integer>> actual = p0797.allPathsSourceTarget(graph);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[][] graph, int[][] output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.graph, Stream.of(s.output).map(x -> IntStream.of(x).boxed().collect(
                    Collectors.toList())).collect(Collectors.toList()));
        }
    }

}