package com.anmorozov.leetcode.problems.solutions.p0863;

import com.anmorozov.leetcode.common.BaseTest;
import com.anmorozov.leetcode.common.TreeNode;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("863. All Nodes Distance K in Binary Tree.")
class SolutionTest {

    static Stream<Arguments> distanceK() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1: Cash parents then use Breadth-First Search algorithm")
    @ParameterizedTest(name = "{0}, k = {3}, output = {4}")
    @MethodSource("distanceK")
    void testMyApproach1(String message, TreeNode root, TreeNode target, int k, SortedSet<Integer> output) {

        Solution solution = new MyApproach1();
        List<Integer> actual = solution.distanceK(root, target, k);
        SortedSet<Integer> actualConverted = new TreeSet<>(actual);
        assertEquals(output, actualConverted, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 2: Depth-First Search on Equivalent Graph")
    @ParameterizedTest(name = "{0}, k = {3}, output = {4}")
    @MethodSource("distanceK")
    void testApproach2(String message, TreeNode root, TreeNode target, int k, SortedSet<Integer> output) {

        Solution solution = new Approach2();
        List<Integer> actual = solution.distanceK(root, target, k);
        SortedSet<Integer> actualConverted = new TreeSet<>(actual);
        assertEquals(output, actualConverted, "Problem in " + solution.getClass().getSimpleName());
    }
}