package com.anmorozov.leetcode.problems.solutions.p0116;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("116. Populating Next Right Pointers in Each Node.")
class SolutionTest {

    static Stream<Arguments> connect() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1.connect")
    @ParameterizedTest(name = "{0}")
    @MethodSource("connect")
    void testMyApproach1(String message, Node root, Node output) {
        Solution solution = new MyApproach1();
        Node actual = solution.connect(root);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: Level Order Traversal")
    @ParameterizedTest(name = "{0}")
    @MethodSource("connect")
    void testApproach1(String message, Node root, Node output) {
        Solution solution = new Approach1();
        Node actual = solution.connect(root);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 2: Using previously established next pointers")
    @ParameterizedTest(name = "{0}")
    @MethodSource("connect")
    void testApproach2(String message, Node root, Node output) {
        Solution solution = new Approach2();
        Node actual = solution.connect(root);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

}