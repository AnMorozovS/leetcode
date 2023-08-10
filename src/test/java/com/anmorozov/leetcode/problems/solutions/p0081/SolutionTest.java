package com.anmorozov.leetcode.problems.solutions.p0081;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("81. Search in Rotated Sorted Array II.")
class SolutionTest {

    static Stream<Arguments> search() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1 : simple")
    @ParameterizedTest(name = "{0}, nums = {1}, target = {2}, output = {3}")
    @MethodSource("search")
    void testMyApproach1(String ignoredMessage, int[] nums, int target, boolean output) {
        Solution solution = new MyApproach1();
        boolean actual = solution.search(nums, target);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: Binary Search")
    @ParameterizedTest(name = "{0}, nums = {1}, target = {2}, output = {3}")
    @MethodSource("search")
    void testApproach1(String ignoredMessage, int[] nums, int target, boolean output) {
        Solution solution = new Approach1();
        boolean actual = solution.search(nums, target);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}