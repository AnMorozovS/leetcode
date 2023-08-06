package com.anmorozov.leetcode.problems.solutions.p0095;

import com.anmorozov.leetcode.common.BaseTest;
import com.anmorozov.leetcode.common.TreeNode;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("95. Unique Binary Search Trees II.")
class SolutionTest {

    static Stream<Arguments> generateTrees() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("Approach 1: Recursive Dynamic Programming")
    @ParameterizedTest(name = "{0}")
    @MethodSource("generateTrees")
    void testApproach1(String ignoredMessage, int n, List<TreeNode> output) {
        Solution solution = new Approach1();
        List<TreeNode> actual = solution.generateTrees(n);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 2: Iterative Dynamic Programming")
    @ParameterizedTest(name = "{0}")
    @MethodSource("generateTrees")
    void testApproach2(String ignoredMessage, int n, List<TreeNode> output) {
        Solution solution = new Approach2();
        List<TreeNode> actual = solution.generateTrees(n);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 3: Dynamic Programming with Space Optimization")
    @ParameterizedTest(name = "{0}")
    @MethodSource("generateTrees")
    void testApproach3(String ignoredMessage, int n, List<TreeNode> output) {
        Solution solution = new Approach3();
        List<TreeNode> actual = solution.generateTrees(n);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}