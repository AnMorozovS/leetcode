package com.anmorozov.leetcode.problems.solutions.p0863;

import com.anmorozov.leetcode.common.TreeNode;
import java.util.List;
import java.util.SortedSet;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, List<Integer> root, int target, int k, SortedSet<Integer> output) {

    public static Arguments getArguments(
            SolutionRecord s) {
        TreeNode root = TreeNode.convertFromArray(s.root);
        if (root == null) {
            throw new RuntimeException(
                    "Constraint : The number of nodes in the tree is in the range [1, 500] - violated.");
        }
        TreeNode target = root.findByNumberUnsorted(s.target);
        String message = s.message + ": root = " + s.root + ", target = " + s.target;
        return arguments(message, root, target, s.k, s.output);
    }
}