package com.anmorozov.leetcode.problems.solutions.p0841;

import java.util.*;

public class MyApproach1 implements Solution {

    @Override
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> actualKey = new LinkedList<>(rooms.getFirst());
        Set<Integer> visitedRooms = new HashSet<>();
        visitedRooms.add(0);
        while (!actualKey.isEmpty()) {
            int openRoom = actualKey.poll();
            if (visitedRooms.contains(openRoom)) {
                continue;
            }
            visitedRooms.add(openRoom);
            actualKey.addAll(rooms.get(openRoom));
        }
        return visitedRooms.size() == rooms.size();
    }
}
