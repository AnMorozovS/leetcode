package com.anmorozov.leetcode.problems.solutions.p2305;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("2305. Fair Distribution of Cookies.")
class SolutionTest {

    static Stream<Arguments> distributeCookies() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1.distributeCookies")
    @ParameterizedTest(name = "{0}: cookies = {1}, k = {2}, output = {3}")
    @MethodSource("distributeCookies")
    void testMyApproach1(String message, int[] cookies, int k, int output) {

        Solution solution = new MyApproach1();
        int actual = solution.distributeCookies(cookies, k);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach: Backtracking")
    @ParameterizedTest(name = "{0}: cookies = {1}, k = {2}, output = {3}")
    @MethodSource("distributeCookies")
    void testApproach1(String message, int[] cookies, int k, int output) {

        Solution solution = new Approach1();
        int actual = solution.distributeCookies(cookies, k);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

}