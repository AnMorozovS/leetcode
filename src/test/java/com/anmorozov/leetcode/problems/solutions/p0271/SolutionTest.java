package com.anmorozov.leetcode.problems.solutions.p0271;

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


@DisplayName("271. Encode and Decode Strings.")
class SolutionTest {

    static Stream<Arguments> sendString() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1")
    @ParameterizedTest(name = "{0}: dummyInput = {1}, output = {2}")
    @MethodSource("sendString")
    void testMyApproach1(String ignoredMessage, List<String> dummyInput, List<String> output) {
        Solution solution = new MyApproach1();
        List<String> actual = solution.sendString(dummyInput);
        assertEquals(output, actual);
    }
}