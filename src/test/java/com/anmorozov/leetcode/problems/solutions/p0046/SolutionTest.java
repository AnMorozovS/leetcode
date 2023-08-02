package com.anmorozov.leetcode.problems.solutions.p0046;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("46. Permutations.")
class SolutionTest {

    static Stream<Arguments> permute() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach : recursion")
    @ParameterizedTest(name = "{0}, nums = {1}, output = {2}")
    @MethodSource("permute")
    void testMyApproach1(String ignoredMessage, int[] nums, List<List<Integer>> output) {
        Solution solution = new MyApproach1();
        List<List<Integer>> actual = solution.permute(nums);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach: Backtracking")
    @ParameterizedTest(name = "{0}, nums = {1}, output = {2}")
    @MethodSource("permute")
    void testApproach1(String ignoredMessage, int[] nums, List<List<Integer>> output) {
        Solution solution = new Approach1();
        List<List<Integer>> actual = solution.permute(nums);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}