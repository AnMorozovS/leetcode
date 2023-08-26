package com.anmorozov.leetcode.problems.solutions.p0097;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("97. Interleaving String.")
class SolutionTest {

    static Stream<Arguments> isInterleave() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("Approach 1 : simple")
    @ParameterizedTest(name = "{0}, s1 = {1}, s2 = {2}, s3 = {3} output = {4}")
    @MethodSource("isInterleave")
    void testApproach1(String ignoredMessage, String s1, String s2, String s3, boolean output) {
        Solution solution = new Approach1();
        boolean actual = solution.isInterleave(s1, s2, s3);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}