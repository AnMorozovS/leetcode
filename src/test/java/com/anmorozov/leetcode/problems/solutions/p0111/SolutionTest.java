package com.anmorozov.leetcode.problems.solutions.p0111;

import com.anmorozov.leetcode.common.BaseTest;
import com.anmorozov.leetcode.common.TreeNode;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("111. Minimum Depth of Binary Tree.")
class SolutionTest {

    static Stream<Arguments> minDepth() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach: Depth-First Search (DFS) with recursion")
    @ParameterizedTest(name = "{0}, output = {2}")
    @MethodSource("minDepth")
    void testMyApproach1(String message, TreeNode root, int output) {
        Solution solution = new MyApproach1();
        int actual = solution.minDepth(root);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: Depth-First Search (DFS)")
    @ParameterizedTest(name = "{0}, output = {2}")
    @MethodSource("minDepth")
    void testApproach1(String message, TreeNode root, int output) {
        Solution solution = new Approach1();
        int actual = solution.minDepth(root);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 2: Breadth-First Search (BFS)")
    @ParameterizedTest(name = "{0}, output = {2}")
    @MethodSource("minDepth")
    void testApproach2(String message, TreeNode root, int output) {
        Solution solution = new Approach2();
        int actual = solution.minDepth(root);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}