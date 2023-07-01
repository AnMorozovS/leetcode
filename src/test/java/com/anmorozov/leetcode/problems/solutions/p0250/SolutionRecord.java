package com.anmorozov.leetcode.problems.solutions.p0250;

import com.anmorozov.leetcode.common.TreeNode;
import java.util.List;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, List<Integer> root, int output) {

    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message, TreeNode.convertFromArray(s.root), s.output);
    }
}
