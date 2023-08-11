package com.anmorozov.leetcode.problems.solutions.p0518;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("518. Coin Change II.")
class SolutionTest {

    static Stream<Arguments> change() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1 : Use cache")
    @ParameterizedTest(name = "{0}: amount = {1}, coins = {2}, output = {3}")
    @MethodSource("change")
    void testMyApproach1(String ignoredMessage, int amount, int[] coins, int output) {

        Solution solution = new MyApproach1();
        int actual = solution.change(amount, coins);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: Top-Down Dynamic Programming")
    @ParameterizedTest(name = "{0}: amount = {1}, coins = {2}, output = {3}")
    @MethodSource("change")
    void testApproach1(String ignoredMessage, int amount, int[] coins, int output) {

        Solution solution = new Approach1();
        int actual = solution.change(amount, coins);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 2: Bottom-Up Dynamic Programming")
    @ParameterizedTest(name = "{0}: amount = {1}, coins = {2}, output = {3}")
    @MethodSource("change")
    void testApproach2(String ignoredMessage, int amount, int[] coins, int output) {

        Solution solution = new Approach2();
        int actual = solution.change(amount, coins);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 3: Dynamic Programming with Space Optimization")
    @ParameterizedTest(name = "{0}: amount = {1}, coins = {2}, output = {3}")
    @MethodSource("change")
    void testApproach3(String ignoredMessage, int amount, int[] coins, int output) {

        Solution solution = new Approach3();
        int actual = solution.change(amount, coins);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}