package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.anmorozov.leetcode.common.TreeNode;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("98. Validate Binary Search Tree.")
class P0098Test {

    static Stream<Arguments> isValidBST() throws IOException {
        BaseTest<P0098Test, SolutionRecord> baseTest = new BaseTest<>(P0098Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("isValidBST")
    @ParameterizedTest(name = "{0}: n = *, output = {2}")
    @MethodSource
    void isValidBST(String message, TreeNode root, boolean output) {
        P0098 p0098 = new P0098();
        boolean actual = p0098.isValidBST(root);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, List<Integer> input, boolean output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, TreeNode.convertFromArray(s.input), s.output);
        }
    }
}