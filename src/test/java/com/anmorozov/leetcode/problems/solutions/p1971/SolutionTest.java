package com.anmorozov.leetcode.problems.solutions.p1971;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("1971. Find if Path Exists in Graph.")
class SolutionTest {

    static Stream<Arguments> validPath() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1")
    @ParameterizedTest(name = "{0}: n = {1}, edges = {2}, source = {3}, destination = {4}, output = {5}")
    @MethodSource("validPath")
    void validPathMyApproach1(String message, int n, int[][] edges, int source, int destination, boolean output) {
        Solution solution = new MyApproach1();
        boolean actual = solution.validPath(n, edges, source, destination);
        assertEquals(output, actual);
    }

    @DisplayName("Approach 1: Breadth First Search (BFS)")
    @ParameterizedTest(name = "{0}: n = {1}, edges = {2}, source = {3}, destination = {4}, output = {5}")
    @MethodSource("validPath")
    void validPathApproach1(String message, int n, int[][] edges, int source, int destination, boolean output) {
        Solution solution = new Approach1();
        boolean actual = solution.validPath(n, edges, source, destination);
        assertEquals(output, actual);
    }

    @DisplayName("Approach 2: Depth First Search (DFS): Recursive")
    @ParameterizedTest(name = "{0}: n = {1}, edges = {2}, source = {3}, destination = {4}, output = {5}")
    @MethodSource("validPath")
    void validPathApproach2(String message, int n, int[][] edges, int source, int destination, boolean output) {
        Solution solution = new Approach2();
        boolean actual = solution.validPath(n, edges, source, destination);
        assertEquals(output, actual);
    }

    @DisplayName("Approach 3: Depth First Search (DFS): Iterative")
    @ParameterizedTest(name = "{0}: n = {1}, edges = {2}, source = {3}, destination = {4}, output = {5}")
    @MethodSource("validPath")
    void validPathApproach3(String message, int n, int[][] edges, int source, int destination, boolean output) {
        Solution solution = new Approach3();
        boolean actual = solution.validPath(n, edges, source, destination);
        assertEquals(output, actual);
    }

    @DisplayName("Approach 4: Disjoint Set Union (DSU)")
    @ParameterizedTest(name = "{0}: n = {1}, edges = {2}, source = {3}, destination = {4}, output = {5}")
    @MethodSource("validPath")
    void validPathApproach4(String message, int n, int[][] edges, int source, int destination, boolean output) {
        Solution solution = new Approach4();
        boolean actual = solution.validPath(n, edges, source, destination);
        assertEquals(output, actual);
    }

}