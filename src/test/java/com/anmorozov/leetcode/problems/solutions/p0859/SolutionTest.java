package com.anmorozov.leetcode.problems.solutions.p0859;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("859. Buddy Strings.")
class SolutionTest {

    static Stream<Arguments> buddyStrings() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1.buddyStrings")
    @ParameterizedTest(name = "{0}: s = {1}, goal = {2}, output = {3}")
    @MethodSource("buddyStrings")
    void testMyApproach1(String message, String s, String goal, boolean output) {

        Solution solution = new MyApproach1();
        boolean actual = solution.buddyStrings(s, goal);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}