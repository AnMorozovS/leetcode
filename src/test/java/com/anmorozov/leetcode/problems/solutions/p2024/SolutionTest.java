package com.anmorozov.leetcode.problems.solutions.p2024;


import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("2024. Maximize the Confusion of an Exam.")
class SolutionTest {

    static Stream<Arguments> maxConsecutiveAnswers() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }


    @DisplayName("Approach 1: Binary Search + Fixed Size Sliding Window")
    @ParameterizedTest(name = "{0}: answerKey = {1}, k = {2}, output = {3}")
    @MethodSource("maxConsecutiveAnswers")
    void testApproach1(String ignoredMessage, String answerKey, int k, int output) {
        Solution solution = new Approach1();
        int actual = solution.maxConsecutiveAnswers(answerKey, k);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}