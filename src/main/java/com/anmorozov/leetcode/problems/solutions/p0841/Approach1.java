package com.anmorozov.leetcode.problems.solutions.p0841;

import java.util.List;
import java.util.Stack;

/**
 * Approach #1: Depth-First Search [Accepted]
 */
public class Approach1 implements Solution {

    @Override
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        seen[0] = true;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            for (int nei : rooms.get(node)) {
                if (!seen[nei]) {
                    seen[nei] = true;
                    stack.push(nei);
                }
            }
        }

        for (boolean v : seen) {
            if (!v) {
                return false;
            }
        }
        return true;
    }
}
