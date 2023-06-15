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

@DisplayName("1161. Maximum Level Sum of a Binary Tree.")
class P1161Test {

    static Stream<Arguments> maxLevelSum() throws IOException {
        BaseTest<P1161Test, SolutionRecord> baseTest = new BaseTest<>(P1161Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("maxLevelSum")
    @ParameterizedTest(name = "{0}: root = *, output = {2}")
    @MethodSource
    void maxLevelSum(String message, TreeNode root, int output) {
        P1161 p1161 = new P1161();
        int actual = p1161.maxLevelSum(root);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, List<Integer> input, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, TreeNode.convertFromArray(s.input), s.output);
        }
    }
}