package com.anmorozov.leetcode.problems.solutions.p1644;

import com.anmorozov.leetcode.common.TreeNode;
import java.util.List;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, List<Integer> root, int p, int q, Integer output) {

    public static Arguments getArguments(
            SolutionRecord s) {
        TreeNode root = TreeNode.convertFromArray(s.root);
        if (root == null) {
            throw new RuntimeException(
                    "Constraint :  - violated.");
        }
        TreeNode p = root.findByNumber(s.p);
        if (p == null) {
            p = new TreeNode(s.p);
        }
        TreeNode q = root.findByNumber(s.q);
        if (q == null) {
            q = new TreeNode(s.q);
        }
        TreeNode output = s.output == null ? null : root.findByNumber(s.output);

        String message = String.format("%1$s: root = %2$s, p = %3$s, q = %4$s, output = %5$s", s.message, s.root, s.p,
                s.q, s.output);
        return arguments(message, root, p, q, output);
    }

}

