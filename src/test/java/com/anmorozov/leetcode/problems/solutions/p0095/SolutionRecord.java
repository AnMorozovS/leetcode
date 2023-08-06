package com.anmorozov.leetcode.problems.solutions.p0095;

import com.anmorozov.leetcode.common.TreeNode;
import java.util.List;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int n, List<List<Integer>> output) {

    public static Arguments getArguments(SolutionRecord s) {

        List<TreeNode> output = s.output().stream().map(TreeNode::convertFromArray).toList();
        String message = s.message + ": n = " + s.n + ", output = " + s.output;

        return arguments(message, s.n, output);
    }
}
