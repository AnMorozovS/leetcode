package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.anmorozov.leetcode.common.TreeNode;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P102Test {

    private static List<Arguments> testCases;

    @BeforeAll
    static void beforeAll() throws IOException {
        BaseTest<P102Test, SolutionRecord> baseTest = new BaseTest<>(P102Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        testCases = baseTest.prepare();

    }

    static Stream<Arguments> levelOrder() {
        return testCases.stream();
    }

    @ParameterizedTest(name = "{0} levelOrder TreeNode")
    @MethodSource
    void levelOrder(String message, TreeNode root, List<List<Integer>> output) {
        P102 p102 = new P102();
        List<List<Integer>> actual = p102.levelOrder(root);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] input, int[][] output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, TreeNode.convertFromArray(s.input),
                    Arrays.stream(s.output).map(x -> Arrays.stream(x).boxed().collect(Collectors.toList())).collect(
                            Collectors.toList()));
        }
    }
}