package com.anmorozov.leetcode.problems.solutions.p0429;

import com.anmorozov.leetcode.common.BaseTest;
import com.anmorozov.leetcode.common.Node;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("429. N-ary Tree Level Order Traversal.")
class SolutionTest {

    static Stream<Arguments> levelOrder() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1.levelOrder")
    @ParameterizedTest(name = "{0}, output = {2}")
    @MethodSource("levelOrder")
    void testMyApproach1(String message, Node root, List<List<Integer>> output) {
        Solution solution = new MyApproach1();
        List<List<Integer>> actual = solution.levelOrder(root);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

}