package com.anmorozov.leetcode.problems.solutions.p0912;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("912. Sort an Array.")
class SolutionTest {

    static Stream<Arguments> sortArray() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1 : Heap Sort")
    @ParameterizedTest(name = "{0}: nums = {1}, output = {2}")
    @MethodSource("sortArray")
    void testMyApproach1(String ignoredMessage, Integer[] nums, Integer[] output) {

        Solution solution = new MyApproach1();
        Integer[] actual = solution.sortArray(nums);
        assertArrayEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}