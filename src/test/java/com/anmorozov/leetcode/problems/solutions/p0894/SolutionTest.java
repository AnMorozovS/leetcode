package com.anmorozov.leetcode.problems.solutions.p0894;

import com.anmorozov.leetcode.common.BaseTest;
import com.anmorozov.leetcode.common.TreeNode;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("894. All Possible Full Binary Trees.")
class SolutionTest {

    static Stream<Arguments> allPossibleFBT() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1: recursion with cache")
    @ParameterizedTest(name = "{0}: n = {1}, output = {2}")
    @MethodSource("allPossibleFBT")
    void testMyApproach1(String message, int n, Set<List<Integer>> output) {

        Solution solution = new MyApproach1();
        List<TreeNode> actual = solution.allPossibleFBT(n);
        System.out.println(actual.size());
        Set<List<Integer>> actualSet = actual.stream().map(TreeNode::convertToArray).collect(Collectors.toSet());
        assertEquals(output, actualSet, "Problem in " + solution.getClass().getSimpleName());
    }
}