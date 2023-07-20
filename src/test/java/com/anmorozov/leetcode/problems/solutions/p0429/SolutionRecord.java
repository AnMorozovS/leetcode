package com.anmorozov.leetcode.problems.solutions.p0429;

import com.anmorozov.leetcode.common.Node;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, int[] root, int[][] output) {

    public static Arguments getArguments(SolutionRecord s) {
        String message = String.format("%1$s: root = %2$s", s.message, Arrays.toString(s.root));
        Node root = Node.convertNodeArray(s.root);
        List<List<Integer>> output = Arrays.stream(s.output).map(x -> Arrays.stream(x).boxed().toList()).toList();
        return arguments(s.message, root, output);
    }
}
