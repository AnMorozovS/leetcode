package com.anmorozov.leetcode.problems.solutions.p1644;

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

@DisplayName("1644.Lowest Common Ancestor of a Binary Tree II.")
class SolutionTest {

    static Stream<Arguments> lowestCommonAncestor() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1 lowestCommonAncestor")
    @ParameterizedTest(name = "{0}")
    @MethodSource("lowestCommonAncestor")
    void testMyApproach1(String message, TreeNode root, TreeNode p, TreeNode q, TreeNode output) {

        Solution solution = new MyApproach1();
        TreeNode actual = solution.lowestCommonAncestor(root, p, q);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: Depth First Search - Modify LCA Solution")
    @ParameterizedTest(name = "{0}")
    @MethodSource("lowestCommonAncestor")
    void testApproach1(String message, TreeNode root, TreeNode p, TreeNode q, TreeNode output) {

        Solution solution = new Approach1();
        TreeNode actual = solution.lowestCommonAncestor(root, p, q);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 2: Depth First Search - 2/3 Conditions")
    @ParameterizedTest(name = "{0}")
    @MethodSource("lowestCommonAncestor")
    void testApproach2(String message, TreeNode root, TreeNode p, TreeNode q, TreeNode output) {

        Solution solution = new Approach2();
        TreeNode actual = solution.lowestCommonAncestor(root, p, q);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

}