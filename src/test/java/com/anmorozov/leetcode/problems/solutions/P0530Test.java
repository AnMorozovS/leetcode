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

@DisplayName("530. Minimum Absolute Difference in BST.")
class P0530Test {

    static Stream<Arguments> getMinimumDifference() throws IOException {
        BaseTest<P0530Test, SolutionRecord> baseTest = new BaseTest<>(P0530Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("getMinimumDifference")
    @ParameterizedTest(name = "{0}: root = *, output = {2}")
    @MethodSource
    void getMinimumDifference(String message, TreeNode root, int output) {
        P0530 p0098 = new P0530();
        int actual = p0098.getMinimumDifference(root);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, List<Integer> input, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, TreeNode.convertFromArray(s.input), s.output);
        }
    }

}