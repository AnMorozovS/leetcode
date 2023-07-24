package com.anmorozov.leetcode.problems.solutions.p0050;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("50. Pow(x, n).")
class SolutionTest {

    static Stream<Arguments> myPow() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach:")
    @ParameterizedTest(name = "{0}, x = {1}, n = {2}, output = {3}")
    @MethodSource("myPow")
    void testMyApproach1(String message, double x, int n, double output) {
        Solution solution = new MyApproach1();
        double actual = solution.myPow(x, n);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}