package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.anmorozov.leetcode.common.TreeNode;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.Objects;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("235. Lowest Common Ancestor of a Binary Search Tree.")
class P0235Test {

    static Stream<Arguments> lowestCommonAncestor() throws IOException {
        BaseTest<P0235Test, SolutionRecord> baseTest = new BaseTest<>(P0235Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("lowestCommonAncestor")
    @ParameterizedTest(name = "{0}")
    @MethodSource
    void lowestCommonAncestor(String message, TreeNode root, TreeNode p, TreeNode q, TreeNode output) {
        P0235 p0235 = new P0235();
        TreeNode actual = p0235.lowestCommonAncestor(root, p, q);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] input, int p, int q, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            TreeNode root = TreeNode.convertFromArray(s.input);
            Objects.requireNonNull(root, "TreeNode is null");
            return arguments(s.message, root, root.findByNumber(s.p), root.findByNumber(s.q),
                    root.findByNumber(s.output));
        }
    }
}