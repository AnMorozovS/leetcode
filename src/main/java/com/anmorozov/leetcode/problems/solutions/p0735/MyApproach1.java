package com.anmorozov.leetcode.problems.solutions.p0735;

import java.util.Deque;
import java.util.LinkedList;

/**
 * My approach : use Deque.
 */
public class MyApproach1 implements Solution {

    @Override
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> result = new LinkedList<>();
        for (int asteroid : asteroids) {
            addAsteroid(result, asteroid);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private void addAsteroid(Deque<Integer> asteroids, int asteroid) {
        Integer previousAsteroid = asteroids.peekLast();
        if (previousAsteroid == null || previousAsteroid < 0 || asteroid > 0) {
            asteroids.addLast(asteroid);
        } else {
            previousAsteroid = asteroids.pollLast();
            if (Math.abs(previousAsteroid) > Math.abs(asteroid)) {
                addAsteroid(asteroids, previousAsteroid);
            } else if (Math.abs(previousAsteroid) < Math.abs(asteroid)) {
                addAsteroid(asteroids, asteroid);
            }
        }
    }
}
