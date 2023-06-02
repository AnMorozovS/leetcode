package com.anmorozov.leetcode.studyplan.common.one.p509;

import com.anmorozov.leetcode.common.CoreTest;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("LeetCode 75 Level 1 Day 10 Easy")
class SolutionTest {

    @SuppressWarnings("InstanceMethodNamingConvention")
    static Stream<Arguments> fib() {
        return CoreTest.prepareIntegerInIntegerOut(x -> x);
    }

    @SuppressWarnings("InstanceMethodNamingConvention")
    @DisplayName("509. Fibonacci Number")
    @ParameterizedTest(name = "{0}")
    @MethodSource
    void fib(String message, int n, int output) {
        Solution solution = new Solution();
        int actual = solution.fib(n);
        assertEquals(output, actual);
    }
}