package com.anmorozov.leetcode.problems.algorithms.sort.comparison;

import java.util.Arrays;
import java.util.Collection;

public class HeapSort<T extends Comparable<T>> implements ComparisonSort<T> {

    T[] instance;

    public HeapSort(T[] instance) {
        this.instance = instance;
    }

    @Override
    public Collection<T> sort(Collection<T> arr) {
        T[] array = arr.toArray(instance);
        heapSort(array);
        return Arrays.stream(array).toList();
    }

    public void heapSort(T[] arr) {
        // Mutates elements in lst by utilizing the heap data structure
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            maxHeap(arr, arr.length, i);
        }

        for (int i = arr.length - 1; i > 0; i--) {
            // swap last element with first element
            T temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            // note that we reduce the heap size by 1 every iteration
            maxHeap(arr, i, 0);
        }
    }

    private void maxHeap(T[] arr, int heapSize, int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int largest = index;
        if (left < heapSize && arr[left].compareTo(arr[largest]) > 0) {
            largest = left;
        }
        if (right < heapSize && arr[right].compareTo(arr[largest]) > 0) {
            largest = right;
        }
        if (largest != index) {
            T temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;
            maxHeap(arr, heapSize, largest);
        }
    }
}
