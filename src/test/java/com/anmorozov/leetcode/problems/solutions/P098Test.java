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

class P098Test {

    private static List<Arguments> testCases;

    @BeforeAll
    static void beforeAll() throws IOException {
        BaseTest<P098Test, SolutionRecord> baseTest = new BaseTest<>(P098Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        testCases = baseTest.prepare();

    }

    static Stream<Arguments> isValidBST() {
        return testCases.stream();
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource
    void isValidBST(String message, TreeNode root, boolean output) {
        System.out.print(root);
        P098 p098 = new P098();
        boolean actual = p098.isValidBST(root);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] input, boolean output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, TreeNode.convertFromArray(s.input), s.output);
        }
    }
}