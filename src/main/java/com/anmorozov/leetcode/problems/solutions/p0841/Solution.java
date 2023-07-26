package com.anmorozov.leetcode.problems.solutions.p0841;

import java.util.List;

/**
 * <p><strong>841.</strong> Keys and Rooms</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>There are {@code n} rooms labeled from {@code 0} to {@code n - 1} and all the rooms are locked except for
     * room {@code 0}. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its
     * key.</p>
     *
     * <p>When you visit a room, you may find a set of <strong>distinct keys</strong> in it. Each key has a number on
     * it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.</p>
     *
     * <p>Given an array {@code rooms} where {@code rooms[i]} is the set of keys that you can obtain if you visited
     * room {@code i}, return {@code true} <em>if you can visit <strong>all</strong> the rooms, or</em> {@code false}
     * <em>otherwise</em>.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code n == rooms.length}</li>
     * 	<li>{@code 2 <= n <= 1000}</li>
     * 	<li>{@code 0 <= rooms[i].length <= 1000}</li>
     * 	<li>{@code 1 <= sum(rooms[i].length) <= 3000}</li>
     * 	<li>{@code 0 <= rooms[i][j] < n}</li>
     * 	<li>All the values of {@code rooms[i]} are <strong>unique</strong>.</li>
     * </ul>
     *
     * @param rooms where {@code rooms[i]} is the set of keys that you can obtain if you visited room {@code i}
     * @return {@code true} <em>if you can visit <strong>all</strong> the rooms, or</em> {@code false}
     * <em>otherwise</em>
     */
    boolean canVisitAllRooms(List<List<Integer>> rooms);
}
