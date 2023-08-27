package com.anmorozov.leetcode.problems.solutions.p0403;

/**
 * <p><strong>403.</strong> Frog Jump.</p>
 * <em>Hard</em>
 */
public interface Solution {
    /**
     * <p>A frog is crossing a river. The river is divided into some number of units, and at each unit, there may or may not exist a stone. The frog can jump on a stone, but it must not jump into the water.</p>
     *
     * <p>Given a list of {@code stones}' positions (in units) in sorted <strong>ascending order</strong>, determine if the frog can cross the river by landing on the last stone. Initially, the frog is on the first stone and assumes the first jump must be {@code 1} unit.</p>
     *
     * <p>If the frog's last jump was {@code k} units, its next jump must be either {@code k - 1}, {@code k}, or {@code k + 1} units. The frog can only jump in the forward direction.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 2 <= stones.length <= 2000}</li>
     * 	<li>{@code 0 <= stones[i] <= 2}<sup>31</sup>{@code  - 1}</li>
     * 	<li>{@code stones[0] == 0}</li>
     * 	<li>{@code stones} is sorted in a strictly increasing order.</li>
     * </ul>
     *
     * @param stones a list of {@code stones}' positions (in units) in sorted <strong>ascending order</strong>
     * @return determine if the frog can cross the river by landing on the last stone
     */
    boolean canCross(int[] stones);
}
