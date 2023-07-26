package com.anmorozov.leetcode.problems.solutions.p1466;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("1466. Reorder Routes to Make All Paths Lead to the City Zero.")
class SolutionTest {

    static Stream<Arguments> minReorder() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1: Breadth First Search")
    @ParameterizedTest(name = "{0}, n = {1}, connections = {2}, output = {3}")
    @MethodSource("minReorder")
    void testMyApproach1(String message, int n, int[][] connections, int output) {
        Solution solution = new MyApproach1();
        int actual = solution.minReorder(n, connections);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 2: Breadth First Search")
    @ParameterizedTest(name = "{0}, n = {1}, connections = {2}, output = {3}")
    @MethodSource("minReorder")
    void testMyApproach2(String message, int n, int[][] connections, int output) {
        Solution solution = new Approach2();
        int actual = solution.minReorder(n, connections);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}