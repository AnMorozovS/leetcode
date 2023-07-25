package com.anmorozov.leetcode.problems.solutions.p0210;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("210. Course Schedule II.")
class SolutionTest {

    static Stream<Arguments> findOrder() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My realisation of Kahn's Algorithm")
    @ParameterizedTest(name = "{0}: numCourses = {1}, prerequisites = {2}, output = {3}")
    @MethodSource("findOrder")
    void testMyApproach1(String message, int numCourses, int[][] prerequisites, int[] output) {

        Solution solution = new MyApproach1();
        int[] actual = solution.findOrder(numCourses, prerequisites);
        assertArrayEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 2: Using Node In degree")
    @ParameterizedTest(name = "{0}: numCourses = {1}, prerequisites = {2}, output = {3}")
    @MethodSource("findOrder")
    void testApproach2(String message, int numCourses, int[][] prerequisites, int[] output) {

        Solution solution = new Approach2();
        int[] actual = solution.findOrder(numCourses, prerequisites);
        assertArrayEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 3: Topological Sorting - Kahn's Algorithm")
    @ParameterizedTest(name = "{0}: numCourses = {1}, prerequisites = {2}, output = {3}")
    @MethodSource("findOrder")
    void testApproach3(String message, int numCourses, int[][] prerequisites, int[] output) {

        Solution solution = new Approach3();
        int[] actual = solution.findOrder(numCourses, prerequisites);
        assertArrayEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}