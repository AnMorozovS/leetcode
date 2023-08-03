package com.anmorozov.leetcode.problems.solutions.p0017;

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

@DisplayName("17. Letter Combinations of a Phone Number.")
class SolutionTest {

    static Stream<Arguments> letterCombinations() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach : ")
    @ParameterizedTest(name = "{0}, digits = {1}, output = {2}")
    @MethodSource("letterCombinations")
    void testMyApproach1(String ignoredMessage, String digits, List<String> output) {
        Solution solution = new MyApproach1();
        List<String> actual = solution.letterCombinations(digits);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}