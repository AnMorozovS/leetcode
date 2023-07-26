package com.anmorozov.leetcode.problems.solutions.p0841;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class MyApproach1 implements Solution {

    @Override
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> actualKey = new LinkedList<>(rooms.get(0));
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
