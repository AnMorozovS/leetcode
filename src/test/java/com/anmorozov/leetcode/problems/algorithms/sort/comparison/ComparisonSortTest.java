package com.anmorozov.leetcode.problems.algorithms.sort.comparison;

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

@DisplayName("Comparison based sorts.")
class ComparisonSortTest {

    static Stream<Arguments> sort() throws IOException {
        BaseTest<ComparisonSortTest, SolutionIntegerRecord> baseTestInteger = new BaseTest<>(ComparisonSortTest.class,
                new TypeReference<>() {
                }, SolutionIntegerRecord::getArguments, "Integer");
        BaseTest<ComparisonSortTest, SolutionStringRecord> baseTestString = new BaseTest<>(ComparisonSortTest.class,
                new TypeReference<>() {
        }, SolutionStringRecord::getArguments, "String");
        return Stream.concat(baseTestInteger.prepare().stream(), baseTestString.prepare().stream());
    }

    @DisplayName("Selection sort")
    @ParameterizedTest(name = "{0}, input = {1}, output = {3}")
    @MethodSource("sort")
    <T extends Comparable<T>> void testSelectionSort(String ignoredMessage, Collection<T> input, T[] instance,
                                                     Collection<T> output) {
        ComparisonSort<T> comparisonSort = new SelectionSort<>(instance);
        Collection<T> actual = comparisonSort.sort(input);
        assertEquals(output, actual);
    }

    @DisplayName("Bubble sort")
    @ParameterizedTest(name = "{0}, input = {1}, output = {3}")
    @MethodSource("sort")
    <T extends Comparable<T>> void testBubbleSort(String ignoredMessage, Collection<T> input, T[] instance,
                                                  Collection<T> output) {
        ComparisonSort<T> comparisonSort = new BubbleSort<>(instance);
        Collection<T> actual = comparisonSort.sort(input);
        assertEquals(output, actual);
    }

    @DisplayName("Insertion sort")
    @ParameterizedTest(name = "{0}, input = {1}, output = {3}")
    @MethodSource("sort")
    <T extends Comparable<T>> void testInsertionSort(String ignoredMessage, Collection<T> input, T[] instance,
                                                     Collection<T> output) {
        ComparisonSort<T> comparisonSort = new InsertionSort<>(instance);
        Collection<T> actual = comparisonSort.sort(input);
        assertEquals(output, actual);
    }

    @DisplayName("Heap Sort")
    @ParameterizedTest(name = "{0}, input = {1}, output = {3}")
    @MethodSource("sort")
    <T extends Comparable<T>> void testHeapSort(String ignoredMessage, Collection<T> input, T[] instance,
                                                Collection<T> output) {
        ComparisonSort<T> comparisonSort = new HeapSort<>(instance);
        Collection<T> actual = comparisonSort.sort(input);
        assertEquals(output, actual);
    }
}