package com.anmorozov.leetcode.problems.algorithms.heap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("MinHeap")
class MinHeapTest {

    @DisplayName("toString()")
    @Test
    void testToString() {
        Heap<Integer> minHeap = new MinHeap<>(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30}, Comparator.comparingInt(Integer::intValue));
        String expected = """
                MinHeap{
                0
                1	2
                3	4	5	6
                7	8	9	10	11	12	13	14
                15	16	17	18	19	20	21	22	23	24	25	26	27	28	29	30}""";
        assertEquals(expected, minHeap.toString());
    }

    @Test
    @DisplayName("size()")
    void size() {
        Heap<Integer> minHeap = new MinHeap<>(new Integer[]{0, 1, 2, 3}, Comparator.comparingInt(Integer::intValue));
        int expected = 4;
        assertEquals(expected, minHeap.size());
    }

    @Test
    @DisplayName("size()")
    void poll() {
        Heap<Integer> minHeap = new MinHeap<>(new Integer[]{0, 1, 3, 4, 2, 5}, Comparator.comparingInt(Integer::intValue));
        assertEquals(0, minHeap.poll());
        String expected = """
                MinHeap{
                1
                2	3
                4	5}""";
        assertEquals(expected, minHeap.toString());
    }

    @Test
    @DisplayName("add()")
    void add() {
        Heap<Integer> minHeap = new MinHeap<>(Integer[]::new, 5, Comparator.comparingInt(Integer::intValue));
        assertTrue(minHeap.add(15));
        assertTrue(minHeap.add(10));
        assertTrue(minHeap.add(6));
        assertTrue(minHeap.add(9));
        assertTrue(minHeap.add(12));
        assertFalse(minHeap.add(5));
        String expected = """
                MinHeap{
                6
                9	10
                15	12}""";
        assertEquals(expected, minHeap.toString());
    }

    @Test
    @DisplayName("peek()")
    void peek() {
        Heap<Integer> minHeap = new MinHeap<>(new Integer[]{0, 1, 2, 3}, Comparator.comparingInt(Integer::intValue));
        assertEquals(0, minHeap.peek());
    }
}