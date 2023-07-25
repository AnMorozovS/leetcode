package com.anmorozov.leetcode.problems.solutions.p1136;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("1136. Parallel Courses.")
class SolutionTest {

    static Stream<Arguments> minimumSemesters() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach of topological sort")
    @ParameterizedTest(name = "{0}, n = {1}, relations = {2}, output = {3}")
    @MethodSource("minimumSemesters")
    void testMyApproach1(String message, int n, int[][] relations, int output) {
        Solution solution = new MyApproach1();
        int actual = solution.minimumSemesters(n, relations);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: Breadth-First Search (Kahn's Algorithm)")
    @ParameterizedTest(name = "{0}, n = {1}, relations = {2}, output = {3}")
    @MethodSource("minimumSemesters")
    void testApproach1(String message, int n, int[][] relations, int output) {
        Solution solution = new Approach1();
        int actual = solution.minimumSemesters(n, relations);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}