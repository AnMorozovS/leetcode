package com.anmorozov.leetcode.problems.solutions.p0864;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import javafx.util.Pair;

/**
 * Approach: Breadth-First Search
 */
public class Approach1 implements Solution {

    @Override
    public int shortestPathAllKeys(String[] grid) {
        int m = grid.length;
        int n = grid[0].length();
        Queue<int[]> queue = new LinkedList<>();
        int[][] moves = new int[][] {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

        // seen['key'] is only for BFS with key state equals 'keys'
        Map<Integer, Set<Pair<Integer, Integer>>> seen = new HashMap<>();

        Set<Character> keySet = new HashSet<>();
        Set<Character> lockSet = new HashSet<>();
        int allKeys = 0;
        int startR = -1;
        int startC = -1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char cell = grid[i].charAt(j);
                if (cell >= 'a' && cell <= 'f') {
                    allKeys += (1 << (cell - 'a'));
                    keySet.add(cell);
                }
                if (cell >= 'A' && cell <= 'F') {
                    lockSet.add(cell);
                }
                if (cell == '@') {
                    startR = i;
                    startC = j;
                }
            }
        }

        // [row, column, key state, distance]
        queue.offer(new int[] {startR, startC, 0, 0});
        seen.put(0, new HashSet<>());
        seen.get(0).add(new Pair<>(startR, startC));

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curR = cur[0];
            int curC = cur[1];
            int keys = cur[2];
            int dist = cur[3];
            for (int[] move : moves) {
                int newR = curR + move[0];
                int newC = curC + move[1];

                // If this cell (newR, newC) is reachable.
                if (newR >= 0 && newR < m && newC >= 0 && newC < n && grid[newR].charAt(newC) != '#') {
                    char cell = grid[newR].charAt(newC);

                    // If it is a key:
                    if (keySet.contains(cell)) {
                        // If we have collected it before, no need to revisit this cell.
                        if (((1 << (cell - 'a')) & keys) != 0) {
                            continue;
                        }

                        // Otherwise, we can walk to this cell and pick it up.
                        int newKeys = (keys | (1 << (cell - 'a')));

                        // If we collect all keys, return dist + 1.
                        // Otherwise, just add this state to seen and queue.
                        if (newKeys == allKeys) {
                            return dist + 1;
                        }
                        seen.putIfAbsent(newKeys, new HashSet<>());
                        seen.get(newKeys).add(new Pair<>(newR, newC));
                        queue.offer(new int[] {newR, newC, newKeys, dist + 1});
                    }

                    // If it is a lock and we don't have its key, continue.
                    if (lockSet.contains(cell) && ((keys & (1 << (cell - 'A'))) == 0)) {
                        continue;
                    }

                    // We can walk to this cell if we haven't been here before with the same key state.
                    if (!seen.get(keys).contains(new Pair<>(newR, newC))) {
                        seen.get(keys).add(new Pair<>(newR, newC));
                        queue.offer(new int[] {newR, newC, keys, dist + 1});
                    }
                }
            }
        }

        return -1;
    }
}
