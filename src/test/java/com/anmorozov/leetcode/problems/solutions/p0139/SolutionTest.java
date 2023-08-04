package com.anmorozov.leetcode.problems.solutions.p0139;

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

@DisplayName("139. Word Break.")
class SolutionTest {

    static Stream<Arguments> wordBreak() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1: Cache")
    @ParameterizedTest(name = "{0}: s = {1}, wordDict = {2}, output = {3}")
    @MethodSource("wordBreak")
    void testMyApproach1(String ignoredMessage, String s, List<String> wordDict, boolean output) {

        Solution solution = new MyApproach1();
        boolean actual = solution.wordBreak(s, wordDict);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: Breadth-First Search")
    @ParameterizedTest(name = "{0}: s = {1}, wordDict = {2}, output = {3}")
    @MethodSource("wordBreak")
    void testApproach1(String ignoredMessage, String s, List<String> wordDict, boolean output) {

        Solution solution = new Approach1();
        boolean actual = solution.wordBreak(s, wordDict);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 2: Top-Down Dynamic Programming")
    @ParameterizedTest(name = "{0}: s = {1}, wordDict = {2}, output = {3}")
    @MethodSource("wordBreak")
    void testApproach2(String ignoredMessage, String s, List<String> wordDict, boolean output) {

        Solution solution = new Approach2();
        boolean actual = solution.wordBreak(s, wordDict);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 3: Bottom-Up Dynamic Programming")
    @ParameterizedTest(name = "{0}: s = {1}, wordDict = {2}, output = {3}")
    @MethodSource("wordBreak")
    void testApproach3(String ignoredMessage, String s, List<String> wordDict, boolean output) {

        Solution solution = new Approach3();
        boolean actual = solution.wordBreak(s, wordDict);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 4: Trie Optimization")
    @ParameterizedTest(name = "{0}: s = {1}, wordDict = {2}, output = {3}")
    @MethodSource("wordBreak")
    void testApproach4(String ignoredMessage, String s, List<String> wordDict, boolean output) {

        Solution solution = new Approach4();
        boolean actual = solution.wordBreak(s, wordDict);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 5: A Different DP")
    @ParameterizedTest(name = "{0}: s = {1}, wordDict = {2}, output = {3}")
    @MethodSource("wordBreak")
    void testApproach5(String ignoredMessage, String s, List<String> wordDict, boolean output) {

        Solution solution = new Approach5();
        boolean actual = solution.wordBreak(s, wordDict);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

}