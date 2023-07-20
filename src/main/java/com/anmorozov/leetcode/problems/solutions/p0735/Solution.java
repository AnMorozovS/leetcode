package com.anmorozov.leetcode.problems.solutions.p0735;

/**
 * <p><b>735.</b> Asteroid Collision.</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>We are given an array {@code asteroids} of integers representing asteroids in a row.</p>
     *
     * <p>For each asteroid, the absolute value represents its size, and the sign represents its direction (positive
     * meaning right, negative meaning left). Each asteroid moves at the same speed.</p>
     *
     * <p>Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will
     * explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never
     * meet.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 2 <= asteroids.length <= 10}<sup>4</sup></li>
     * 	<li>{@code -1000 <= asteroids[i] <= 1000}</li>
     * 	<li>{@code asteroids[i] != 0}</li>
     * </ul>
     *
     * @param asteroids an array of integers representing asteroids in a row.
     * @return the state of the asteroids after all collisions
     */
    int[] asteroidCollision(int[] asteroids);
}
