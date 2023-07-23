package com.anmorozov.leetcode.problems.solutions.p0439;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("439. Ternary Expression Parser.")
class SolutionTest {

    static Stream<Arguments> parseTernary() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1")
    @ParameterizedTest(name = "{0}: expression = {1}, output = {2}")
    @MethodSource("parseTernary")
    void testMyApproach1(String message, String expression, String output) {

        Solution solution = new MyApproach1();
        String actual = solution.parseTernary(expression);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: Find Rightmost Atomic Expression")
    @ParameterizedTest(name = "{0}: expression = {1}, output = {2}")
    @MethodSource("parseTernary")
    void testApproach1(String message, String expression, String output) {

        Solution solution = new Approach1();
        String actual = solution.parseTernary(expression);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 2: Reverse Polish Notation")
    @ParameterizedTest(name = "{0}: expression = {1}, output = {2}")
    @MethodSource("parseTernary")
    void testApproach2(String message, String expression, String output) {

        Solution solution = new Approach2();
        String actual = solution.parseTernary(expression);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 3: Reverse Polish Notation using Stack")
    @ParameterizedTest(name = "{0}: expression = {1}, output = {2}")
    @MethodSource("parseTernary")
    void testApproach3(String message, String expression, String output) {

        Solution solution = new Approach3();
        String actual = solution.parseTernary(expression);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 4: Binary Tree")
    @ParameterizedTest(name = "{0}: expression = {1}, output = {2}")
    @MethodSource("parseTernary")
    void testApproach4(String message, String expression, String output) {

        Solution solution = new Approach4();
        String actual = solution.parseTernary(expression);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 5: Recursion")
    @ParameterizedTest(name = "{0}: expression = {1}, output = {2}")
    @MethodSource("parseTernary")
    void testApproach5(String message, String expression, String output) {

        Solution solution = new Approach5();
        String actual = solution.parseTernary(expression);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 6: Constant Space Solution")
    @ParameterizedTest(name = "{0}: expression = {1}, output = {2}")
    @MethodSource("parseTernary")
    void testApproach6(String message, String expression, String output) {

        Solution solution = new Approach6();
        String actual = solution.parseTernary(expression);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}