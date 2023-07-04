package com.anmorozov.leetcode.problems.solutions.p0137;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("137. Single Number II.")
class SolutionTest {

    static Stream<Arguments> singleNumber() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1: Hash Map")
    @ParameterizedTest(name = "{0}: nums = {1}, output = {2}")
    @MethodSource("singleNumber")
    void testMyApproach1(String message, int[] nums, int output) {

        Solution solution = new MyApproach1();
        int actual = solution.singleNumber(nums);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: Sorting")
    @ParameterizedTest(name = "{0}: nums = {1}, output = {2}")
    @MethodSource("singleNumber")
    void testApproach1(String message, int[] nums, int output) {

        Solution solution = new Approach1();
        int actual = solution.singleNumber(nums);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 2: Hash Map")
    @ParameterizedTest(name = "{0}: nums = {1}, output = {2}")
    @MethodSource("singleNumber")
    void testApproach2(String message, int[] nums, int output) {

        Solution solution = new Approach2();
        int actual = solution.singleNumber(nums);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 3: Mathematics")
    @ParameterizedTest(name = "{0}: nums = {1}, output = {2}")
    @MethodSource("singleNumber")
    void testApproach3(String message, int[] nums, int output) {

        Solution solution = new Approach3();
        int actual = solution.singleNumber(nums);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 4: Bit Manipulation")
    @ParameterizedTest(name = "{0}: nums = {1}, output = {2}")
    @MethodSource("singleNumber")
    void testApproach4(String message, int[] nums, int output) {

        Solution solution = new Approach4();
        int actual = solution.singleNumber(nums);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 5: Equation for Bitmask")
    @ParameterizedTest(name = "{0}: nums = {1}, output = {2}")
    @MethodSource("singleNumber")
    void testApproach5(String message, int[] nums, int output) {

        Solution solution = new Approach5();
        int actual = solution.singleNumber(nums);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 6: Boolean Algebra and Karnaugh Map")
    @ParameterizedTest(name = "{0}: nums = {1}, output = {2}")
    @MethodSource("singleNumber")
    void testApproach6(String message, int[] nums, int output) {

        Solution solution = new Approach6();
        int actual = solution.singleNumber(nums);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}