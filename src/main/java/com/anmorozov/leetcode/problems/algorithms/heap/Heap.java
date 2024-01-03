package com.anmorozov.leetcode.problems.algorithms.heap;

public interface Heap<T> {

    boolean add(T element);

    /**
     * Get the top element of the Heap
     */
    T peek();

    /**
     * Delete the top element of the Heap
     */
    T poll();

    /**
     * return the number of elements in the Heap
     */
    int size();
}
