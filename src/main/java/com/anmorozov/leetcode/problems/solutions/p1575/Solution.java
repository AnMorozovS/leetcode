package com.anmorozov.leetcode.problems.solutions.p1575;

/**
 * <p><b>1575.</b> Count All Possible Routes</p>
 * <i>Hard</i>
 */
public interface Solution {

    /**
     * <p>You are given an array of <strong>distinct</strong> positive integers locations where {@code locations[i]}
     * represents the position of city {@code i}. You are also given integers {@code start}, {@code finish} and {@code
     * fuel} representing the starting city, ending city, and the initial amount of fuel you have, respectively.</p>
     *
     * <p>At each step, if you are at city {@code i}, you can pick any city {@code j} such that {@code j != i} and
     * {@code 0 <= j < locations.length} and move to city {@code j}. Moving from city {@code i} to city {@code j}
     * reduces the amount of fuel you have by {@code |locations[i] - locations[j]|}. Please notice that {@code |x|}
     * denotes the absolute value of {@code x}.</p>
     *
     * <p>Notice that {@code fuel} <strong>cannot</strong> become negative at any point in time, and that you are
     * <strong>allowed</strong> to visit any city more than once (including {@code start} and {@code finish}).</p>
     *
     * <p>Return <em>the count of all possible routes from </em>{@code start} <em>to</em> {@code finish}. Since the
     * answer may be too large, return it modulo {@code 10}<sup>9</sup>{@code  + 7}.</p>
     *
     * @param locations positive integers locations where {@code locations[i]} represents the position of city {@code
     * i}
     * @param start the starting city.
     * @param finish ending city.
     * @param fuel the initial amount of fuel you have.
     * @return <em>the count of all possible routes from </em>{@code start} <em>to</em> {@code finish}. Since the answer
     * may be too large, return it modulo {@code 10}<sup>9</sup>{@code  + 7}.
     */
    int countRoutes(int[] locations, int start, int finish, int fuel);
}
