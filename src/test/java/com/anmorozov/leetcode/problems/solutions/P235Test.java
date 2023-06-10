package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.anmorozov.leetcode.common.TreeNode;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P235Test {


    private static List<Arguments> testCases;

    @BeforeAll
    static void beforeAll() throws IOException {
        BaseTest<P235Test, SolutionRecord> baseTest = new BaseTest<>(P235Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        testCases = baseTest.prepare();

    }

    static Stream<Arguments> lowestCommonAncestor() {
        return testCases.stream();
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource
    void lowestCommonAncestor(String message, TreeNode root, TreeNode p, TreeNode q, TreeNode output) {
        P235 p235 = new P235();
        TreeNode actual = p235.lowestCommonAncestor(root, p, q);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] input, int p, int q, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            TreeNode root = TreeNode.convertFromArray(s.input);
            return arguments(s.message, root, root.findByNumber(s.p), root.findByNumber(s.q),
                    root.findByNumber(s.output));
        }
    }
}