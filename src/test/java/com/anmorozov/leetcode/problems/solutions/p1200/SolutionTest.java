package com.anmorozov.leetcode.problems.solutions.p1200;

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

@DisplayName("1200. Minimum Absolute Difference.")
class SolutionTest {

    static Stream<Arguments> minimumAbsDifference() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1 : Sort then check")
    @ParameterizedTest(name = "{0}, arr = {1}, output = {2}")
    @MethodSource("minimumAbsDifference")
    void testMyApproach1(String ignoredMessage, int[] arr, List<List<Integer>> output) {
        Solution solution = new MyApproach1();
        List<List<Integer>> actual = solution.minimumAbsDifference(arr);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 3: Counting Sort")
    @ParameterizedTest(name = "{0}, arr = {1}, output = {2}")
    @MethodSource("minimumAbsDifference")
    void testApproach3(String ignoredMessage, int[] arr, List<List<Integer>> output) {
        Solution solution = new Approach3();
        List<List<Integer>> actual = solution.minimumAbsDifference(arr);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}