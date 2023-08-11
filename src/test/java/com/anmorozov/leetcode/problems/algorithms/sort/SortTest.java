package com.anmorozov.leetcode.problems.algorithms.sort;

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
class SortTest {

    static Stream<Arguments> sort() throws IOException {
        BaseTest<SortTest, SolutionIntegerRecord> baseTestInteger = new BaseTest<>(SortTest.class,
                new TypeReference<>() {
                }, SolutionIntegerRecord::getArguments, "Integer");
        BaseTest<SortTest, SolutionStringRecord> baseTestString = new BaseTest<>(SortTest.class, new TypeReference<>() {
        }, SolutionStringRecord::getArguments, "String");
        return Stream.concat(baseTestInteger.prepare().stream(), baseTestString.prepare().stream());
    }

    @DisplayName("Selection sort")
    @ParameterizedTest(name = "{0}, input = {1}, output = {3}")
    @MethodSource("sort")
    <T extends Comparable<T>> void testSelectionSort(String ignoredMessage, Collection<T> input, T[] instance,
                                                     Collection<T> output) {
        Sort<T> sort = new SelectionSort<>(instance);
        Collection<T> actual = sort.sort(input);
        assertEquals(output, actual);
    }

    @DisplayName("Bubble sort")
    @ParameterizedTest(name = "{0}, input = {1}, output = {3}")
    @MethodSource("sort")
    <T extends Comparable<T>> void testBubbleSort(String ignoredMessage, Collection<T> input, T[] instance,
                                                  Collection<T> output) {
        Sort<T> sort = new BubbleSort<>(instance);
        Collection<T> actual = sort.sort(input);
        assertEquals(output, actual);
    }

    @DisplayName("Insertion sort")
    @ParameterizedTest(name = "{0}, input = {1}, output = {3}")
    @MethodSource("sort")
    <T extends Comparable<T>> void testInsertionSort(String ignoredMessage, Collection<T> input, T[] instance,
                                                     Collection<T> output) {
        Sort<T> sort = new InsertionSort<>(instance);
        Collection<T> actual = sort.sort(input);
        assertEquals(output, actual);
    }

    @DisplayName("Heap Sort")
    @ParameterizedTest(name = "{0}, input = {1}, output = {3}")
    @MethodSource("sort")
    <T extends Comparable<T>> void testHeapSort(String ignoredMessage, Collection<T> input, T[] instance,
                                                Collection<T> output) {
        Sort<T> sort = new HeapSort<>(instance);
        Collection<T> actual = sort.sort(input);
        assertEquals(output, actual);
    }
}