package com.anmorozov.leetcode.problems.algorithms.heap;

import java.util.Comparator;
import java.util.function.IntFunction;

public class MinHeap<T> implements Heap<T> {

    private final T[] queue;
    private final Comparator<? super T> comparator;
    private int realSize;

    public MinHeap(IntFunction<T[]> generator, int size, Comparator<? super T> comparator) {
        this.queue = generator.apply(size);
        this.comparator = comparator;
        this.realSize = 0;
    }

    public MinHeap(T[] array, Comparator<? super T> comparator) {
        this.queue = array;
        this.comparator = comparator;
        this.realSize = array.length;
    }

    private void makeHeap(int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int smallest = index;
        if (left < realSize && comparator.compare(queue[left], queue[smallest]) < 0) {
            smallest = left;
        }
        if (right < realSize && comparator.compare(queue[right], queue[smallest]) < 0) {
            smallest = right;
        }
        if (smallest != index) {
            T temp = queue[index];
            queue[index] = queue[smallest];
            queue[smallest] = temp;
            makeHeap(smallest);
        }
    }


    @Override
    public boolean add(T element) {
        if (realSize < (queue.length)) {
            queue[realSize] = element;
            realSize++;
            moveUp(realSize - 1);
            return true;
        }
        return false;
    }

    private void moveUp(int index) {
        if (index == 0) {
            return;
        }
        int parent = (index - 1) / 2;
        if (comparator.compare(queue[parent], queue[index]) > 0) {
            T tmp = queue[parent];
            queue[parent] = queue[index];
            queue[index] = tmp;
            moveUp(parent);
        }
    }

    @Override
    public T peek() {
        return queue[0];
    }

    @Override
    public T poll() {
        T result = queue[0];
        queue[0] = queue[realSize - 1];
        realSize--;
        makeHeap(0);
        return result;
    }

    @Override
    public int size() {
        return this.realSize;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("MinHeap{");
        int power = 1;
        for (int i = 0; i < realSize; i++) {
            if ((i + 1) % power == 0) {
                power = power * 2;
                builder.append('\n');
            } else {
                builder.append('\t');
            }
            builder.append(queue[i].toString());
        }
        builder.append('}');
        return builder.toString();
    }
}
