package com.anmorozov.leetcode.problems.algorithms.selctionsort;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.Collection;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Selection Sort.")
class SelectionSortTest {

    static Stream<Arguments> selectionSort() throws IOException {
        BaseTest<SelectionSortTest, SolutionIntegerRecord> baseTestInteger = new BaseTest<>(SelectionSortTest.class,
                new TypeReference<>() {
                }, SolutionIntegerRecord::getArguments, "Integer");
        BaseTest<SelectionSortTest, SolutionStringRecord> baseTestString = new BaseTest<>(SelectionSortTest.class,
                new TypeReference<>() {
                }, SolutionStringRecord::getArguments, "String");
        return Stream.concat(baseTestInteger.prepare().stream(), baseTestString.prepare().stream());
    }

    @DisplayName("Implementation")
    @ParameterizedTest(name = "{0}, input = {1}, output = {3}")
    @MethodSource("selectionSort")
    <T extends Comparable<T>> void testMyApproach1(String ignoredMessage, Collection<T> input, T[] instance,
                                                   Collection<T> output) {
        Collection<T> actual = (new SelectionSort<>(instance)).selectionSort(input);
        assertEquals(output, actual);
    }
}