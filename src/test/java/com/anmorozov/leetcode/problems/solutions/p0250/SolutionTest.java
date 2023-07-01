package com.anmorozov.leetcode.problems.solutions.p0250;

import com.anmorozov.leetcode.common.BaseTest;
import com.anmorozov.leetcode.common.TreeNode;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("250. Count Uni-value Subtrees.")
class SolutionTest {

    static Stream<Arguments> countUnivalSubtrees() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1.countUnivalSubtrees")
    @ParameterizedTest(name = "{0}")
    @MethodSource("countUnivalSubtrees")
    void testMyApproach1(String message, TreeNode root, int output) {
        Solution solution = new MyApproach1();
        int actual = solution.countUnivalSubtrees(root);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

}