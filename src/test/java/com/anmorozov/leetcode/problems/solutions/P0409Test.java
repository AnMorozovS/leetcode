package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0409Test {

    static Stream<Arguments> longestPalindrome() throws IOException {
        BaseTest<P0409Test, SolutionRecord> baseTest = new BaseTest<>(P0409Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @ParameterizedTest(name = "{0} The longest palindrome that can be built is {1}, whose length is {2}.  ")
    @MethodSource
    void longestPalindrome(String message, String input, int output) {
        P0409 p0409 = new P0409();
        int actual = p0409.longestPalindrome(input);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, String input, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.input, s.output);
        }
    }


}