package com.anmorozov.leetcode.problems.solutions.p0269;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("269. Alien Dictionary.")
class SolutionTest {

    static Stream<Arguments> alienOrder() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1")
    @ParameterizedTest(name = "{0}: words = {1}, output = {2}")
    @MethodSource("alienOrder")
    void alienOrder(String message, String[] words, String output) {
        Solution solution = new MyApproach1();
        String actual = solution.alienOrder(words);
        assertEquals(output, actual);
    }
}