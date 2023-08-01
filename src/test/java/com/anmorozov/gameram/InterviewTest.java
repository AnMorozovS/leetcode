package com.anmorozov.gameram;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 27.07.2023 Interview task
 */
class InterviewTest {

    static Stream<Arguments> validateString() throws IOException {
        BaseTest<InterviewTest, SolutionRecord> baseTest = new BaseTest<>(
                InterviewTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName(value = "My Approach:")
    @ParameterizedTest(name = "{0}, input = {1}, output = {2}")
    @MethodSource("validateString")
    void testMyApproach1(String ignoredMessage, String input, boolean output) {
        Interview solution = new Interview();
        boolean actual = solution.validateString(input);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

}