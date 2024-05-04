package com.anmorozov.leetcode.problems.algorithms.sort.comparison;

import java.util.Arrays;
import java.util.Collection;

public class SelectionSort<T extends Comparable<T>> implements ComparisonSort<T> {

    final T[] instance;

    public SelectionSort(T[] instance) {
        this.instance = instance;
    }

    @Override
    public Collection<T> sort(Collection<T> arr) {
        T[] array = arr.toArray(instance);

        // Mutates arr so that it is sorted via selecting the minimum element and
        // swapping it with the corresponding index
        int minIndex;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap current index with minimum element in rest of list
            T temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return Arrays.stream(array).toList();
    }

}
