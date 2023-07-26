package com.anmorozov.leetcode.common;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.function.Function;

public class QueueWithMemory<E, T> {

    private final Queue<E> actual = new LinkedList<>();
    private final Set<T> visited = new HashSet<>();
    private final Function<E, T> transform;

    public QueueWithMemory(E initial, Function<E, T> transform) {
        this.transform = transform;
        this.offer(initial);
    }

    public boolean isEmpty() {
        return actual.isEmpty();
    }

    public boolean offer(E e) {
        T t = transform.apply(e);
        if (!visited.contains(t)) {
            visited.add(t);
            return actual.offer(e);
        }
        return false;
    }

    public E poll() {
        return actual.poll();
    }

}
