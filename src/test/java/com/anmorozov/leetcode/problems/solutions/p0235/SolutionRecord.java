package com.anmorozov.leetcode.problems.solutions.p0235;

import com.anmorozov.leetcode.common.TreeNode;
import java.util.List;
import java.util.Objects;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, List<Integer> root, int p, int q, int output) {

    public static Arguments getArguments(SolutionRecord s) {
        TreeNode root = TreeNode.convertFromArray(s.root);
        Objects.requireNonNull(root, "TreeNode is null");
        String message = s.message + ": root = " + s.root + ", p = " + s.p + ", q = " + s.q + ", output = " + s.output;
        return arguments(message, root, root.findByNumber(s.p), root.findByNumber(s.q),
                root.findByNumber(s.output));
    }
}
