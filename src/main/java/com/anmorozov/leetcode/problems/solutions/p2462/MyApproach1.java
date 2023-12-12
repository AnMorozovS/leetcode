package com.anmorozov.leetcode.problems.solutions.p2462;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class MyApproach1 implements Solution {

    @Override
    public long totalCost(int[] costs, int k, int candidates) {
        int firstPartEnd = Math.min(candidates, costs.length);
        int secondPartStart = Math.max(firstPartEnd, costs.length - candidates);

        PriorityQueue<Integer> firstPart = Arrays.stream(Arrays.copyOfRange(costs, 0, firstPartEnd)).boxed()
                .collect(PriorityQueue::new, PriorityQueue::add, AbstractQueue::addAll);
        PriorityQueue<Integer> secondPart = Arrays.stream(Arrays.copyOfRange(costs, secondPartStart, costs.length))
                .boxed().collect(PriorityQueue::new, PriorityQueue::add, AbstractQueue::addAll);
        LinkedList<Integer> heap = Arrays.stream(Arrays.copyOfRange(costs, firstPartEnd, secondPartStart)).boxed()
                .collect(LinkedList::new, LinkedList::add, LinkedList::addAll);

        long totalCost = 0;
        for (int i = 0; i < k; i++) {
            totalCost += hireCandidate(firstPart, secondPart, heap);
        }
        return totalCost;
    }

    private int hireCandidate(PriorityQueue<Integer> firstPart, PriorityQueue<Integer> secondPart,
                              LinkedList<Integer> heap) {
        int result = 0;
        if (firstPart.peek() != null && (secondPart.peek() == null || firstPart.peek() <= secondPart.peek())) {
            result = firstPart.poll();
            if (!heap.isEmpty()) {
                int temp = heap.pollFirst();
                firstPart.add(temp);
            }
        } else if (secondPart.peek() != null && (firstPart.peek() == null || secondPart.peek() <= firstPart.peek())) {
            result = secondPart.poll();
            if (!heap.isEmpty()) {
                int temp = heap.pollLast();
                secondPart.add(temp);
            }
        }
        return result;
    }

}
