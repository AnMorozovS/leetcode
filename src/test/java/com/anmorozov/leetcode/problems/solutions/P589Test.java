package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.anmorozov.leetcode.common.Node;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P589Test {

    private static List<Arguments> testCases;

    @BeforeAll
    static void beforeAll() throws IOException {
        BaseTest<P589Test, SolutionRecord> baseTest = new BaseTest<>(P589Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        testCases = baseTest.prepare();

    }

    static Stream<Arguments> preorder() {
        return testCases.stream();
    }

    @ParameterizedTest(name = "{0} preorder Node")
    @MethodSource
    void preorder(String message, Node root, List<Integer> output) {
        P589 p589 = new P589();
        List<Integer> actual = p589.preorder(root);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] input, int[] output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, Node.convertNodeArray(s.input), Arrays.stream(s.output).boxed().toList());
        }
    }
}