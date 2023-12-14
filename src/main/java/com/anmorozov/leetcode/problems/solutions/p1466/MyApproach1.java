package com.anmorozov.leetcode.problems.solutions.p1466;

import com.anmorozov.leetcode.common.QueueWithMemory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        QueueWithMemory<Path, Integer> actualCities = new QueueWithMemory<>(new Path(0, FORWARD), Path::city);
        int roadsNeedToChange = 0;
        while (!actualCities.isEmpty()) {
            roadsNeedToChange += (int) cityRoads.get(actualCities.poll().city()).stream()
                    .filter(actualCities::offer)
                    .filter(x -> x.direction() == FORWARD)
                    .count();
        }
        return roadsNeedToChange;
    }
}
