package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.anmorozov.leetcode.problems.solutions.P2101.Bomb;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("2101. Detonate the Maximum Bombs.")
class P2101Test {

    static Stream<Arguments> maximumDetonation() throws IOException {
        BaseTest<P2101Test, SolutionRecord> baseTest = new BaseTest<>(P2101Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("maximumDetonation")
    @ParameterizedTest(name = "{0}: bombs = {1} ")
    @MethodSource
    void maximumDetonation(String message, int[][] bombs, int output) {
        P2101 p2101 = new P2101();
        int actual = p2101.maximumDetonation(bombs);
        assertEquals(output, actual);
    }

    @Test
    void canDetonate() {
        Bomb bomb0 = new Bomb(2, 1, 3, 0);
        Bomb bomb1 = new Bomb(6, 1, 4, 1);
        assertTrue(bomb1.canDetonate(bomb0));
        assertFalse(bomb0.canDetonate(bomb1));
    }


    record SolutionRecord(String message, int[][] bombs, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.bombs, s.output);
        }
    }

}