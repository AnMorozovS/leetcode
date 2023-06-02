package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P409Test {

    private static List<Arguments> testCases;

    @BeforeAll
    static void beforeAll() throws IOException {
        BaseTest<P409Test, SolutionRecord> baseTest = new BaseTest<>(P409Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        testCases = baseTest.prepare();

    }

    static Stream<Arguments> longestPalindrome() {
        return testCases.stream();
    }

    @ParameterizedTest(name = "{0} The longest palindrome that can be built is {1}, whose length is {2}.  ")
    @MethodSource
    void longestPalindrome(String message, String input, int output) {
        P409 p409 = new P409();
        int actual = p409.longestPalindrome(input);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, String input, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.input, s.output);
        }
    }


}