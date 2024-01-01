package com.anmorozov.leetcode.problems.solutions.p1216;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("1216. Valid Palindrome III.")
class SolutionTest {

    static Stream<Arguments> isValidPalindrome() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("Approach 3: Bottom-Up DP (1D):")
    @ParameterizedTest(name = "{0}, s = {1}, k = {2}, output = {3}")
    @MethodSource("isValidPalindrome")
    void testApproach3(String ignoredMessage, String s, int k, boolean output) {
        Solution solution = new Approach3();
        boolean actual = solution.isValidPalindrome(s, k);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}