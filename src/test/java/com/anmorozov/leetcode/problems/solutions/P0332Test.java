package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("332. Reconstruct Itinerary.")
class P0332Test {

    static Stream<Arguments> findItinerary() throws IOException {
        BaseTest<P0332Test, SolutionRecord> baseTest = new BaseTest<>(P0332Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("findItinerary")
    @ParameterizedTest(name = "{0}: tickets = {1}, output = {2} ")
    @MethodSource
    void findItinerary(String message, List<List<String>> tickets, List<String> output) {
        P0332 p0332 = new P0332();
        List<String> actual = p0332.findItinerary(tickets);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, String[][] tickets, String[] output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, Stream.of(s.tickets).map(Arrays::asList).collect(Collectors.toList()),
                    Arrays.asList(s.output));
        }
    }

}