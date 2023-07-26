package com.anmorozov.leetcode.problems.solutions.p1466;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import static com.anmorozov.leetcode.problems.solutions.p1466.Direction.BACKWARD;
import static com.anmorozov.leetcode.problems.solutions.p1466.Direction.FORWARD;

/**
 * My Approach 1: Breadth First Search
 */
public class MyApproach1 implements Solution {

    @Override
    public int minReorder(int n, int[][] connections) {
        Map<Integer, List<Path>> cityRoads = new HashMap<>();
        for (int[] connection : connections) {
            cityRoads.computeIfAbsent(connection[0], k -> new ArrayList<>()).add(new Path(connection[1], FORWARD));
            cityRoads.computeIfAbsent(connection[1], k -> new ArrayList<>()).add(new Path(connection[0], BACKWARD));
        }
        Queue<Integer> actualCities = new LinkedList<>();
        actualCities.offer(0);
        Set<Integer> visitedCities = new HashSet<>();
        visitedCities.add(0);
        int roadsNeedToChange = 0;
        while (!actualCities.isEmpty()) {
            int city = actualCities.poll();
            for (Path neighbor : cityRoads.get(city)) {
                if (!visitedCities.contains(neighbor.city())) {
                    roadsNeedToChange += neighbor.direction().getSign();
                    actualCities.offer(neighbor.city());
                    visitedCities.add(neighbor.city());
                }
            }
        }
        return roadsNeedToChange;
    }
}
