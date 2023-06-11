package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.anmorozov.leetcode.common.Node;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0589Test {

    static Stream<Arguments> preorder() throws IOException {
        BaseTest<P0589Test, SolutionRecord> baseTest = new BaseTest<>(P0589Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @ParameterizedTest(name = "{0} preorder Node")
    @MethodSource
    void preorder(String message, Node root, List<Integer> output) {
        P0589 p0589 = new P0589();
        List<Integer> actual = p0589.preorder(root);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] input, int[] output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, Node.convertNodeArray(s.input), Arrays.stream(s.output).boxed().toList());
        }
    }
}