package com.anmorozov.leetcode.problems.algorithms.sort.comparison;

import java.util.Arrays;
import java.util.Collection;

public class BubbleSort<T extends Comparable<T>> implements ComparisonSort<T> {

    T[] instance;

    public BubbleSort(T[] instance) {
        this.instance = instance;
    }

    @Override
    public Collection<T> sort(Collection<T> arr) {
        T[] array = arr.toArray(instance);
        // Mutates array so that it is sorted via swapping adjacent elements until
        // the array is sorted.
        boolean hasSwapped = true;
        while (hasSwapped) {
            hasSwapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    // Swap adjacent elements
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    hasSwapped = true;
                }
            }
        }
        return Arrays.stream(array).toList();
    }
}
