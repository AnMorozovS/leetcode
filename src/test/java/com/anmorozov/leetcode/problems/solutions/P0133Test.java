package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.anmorozov.leetcode.problems.solutions.P0133.Node;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("133. Clone Graph.")
class P0133Test {

    static Stream<Arguments> cloneGraph() throws IOException {
        BaseTest<P0133Test, SolutionRecord> baseTest = new BaseTest<>(P0133Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("cloneGraph")
    @ParameterizedTest(name = "{0}: adjList = {1}, output = {2} ")
    @MethodSource
    void cloneGraph(String message, int[][] adjList, int[][] output) {
        P0133 p0133 = new P0133();
        int[][] actual = Node.nodeToArray(p0133.cloneGraph(Node.arrayToNode(adjList)));
        assertArrayEquals(output, actual);
    }

    record SolutionRecord(String message, int[][] adjList, int[][] output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.adjList, s.output);
        }
    }
}