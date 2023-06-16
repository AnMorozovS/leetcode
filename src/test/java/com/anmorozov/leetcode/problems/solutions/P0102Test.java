package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.anmorozov.leetcode.common.TreeNode;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("102. Binary Tree Level Order Traversal.")
class P0102Test {

    static Stream<Arguments> levelOrder() throws IOException {
        BaseTest<P0102Test, SolutionRecord> baseTest = new BaseTest<>(P0102Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @ParameterizedTest(name = "{0} levelOrder TreeNode")
    @MethodSource
    void levelOrder(String message, TreeNode root, List<List<Integer>> output) {
        P0102 p0102 = new P0102();
        List<List<Integer>> actual = p0102.levelOrder(root);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, List<Integer> input, int[][] output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, TreeNode.convertFromArray(s.input),
                    Arrays.stream(s.output).map(x -> Arrays.stream(x).boxed().collect(Collectors.toList())).collect(
                            Collectors.toList()));
        }
    }
}