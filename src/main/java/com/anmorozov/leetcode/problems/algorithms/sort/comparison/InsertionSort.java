package com.anmorozov.leetcode.problems.algorithms.sort.comparison;

import java.util.Arrays;
import java.util.Collection;

public class InsertionSort<T extends Comparable<T>> implements ComparisonSort<T> {

    final T[] instance;

    public InsertionSort(T[] instance) {
        this.instance = instance;
    }

    @Override
    public Collection<T> sort(Collection<T> arr) {
        T[] array = arr.toArray(instance);
        // Mutates elements in array by inserting out of place elements into appropriate
        // index repeatedly until array is sorted
        for (int i = 1; i < array.length; i++) {
            int currentIndex = i;
            while (currentIndex > 0 && array[currentIndex - 1].compareTo(array[currentIndex]) > 0) {
                // Swap elements that are out of order
                T temp = array[currentIndex];
                array[currentIndex] = array[currentIndex - 1];
                array[currentIndex - 1] = temp;
                currentIndex -= 1;
            }
        }
        return Arrays.stream(array).toList();
    }
}
