package com.anmorozov.leetcode.problems.solutions.p0956;

/**
 * <p><b>956.</b> Tallest Billboard</p>
 * <i>Hard</i>
 */
public interface Solution {

    /**
     * <p>You are installing a billboard and want it to have the largest height. The billboard will have two steel
     * supports, one on each side. Each steel support must be an equal height.</p>
     *
     * <p>You are given a collection of {@code rods} that can be welded together. For example, if you have rods of
     * lengths {@code 1}, {@code 2}, and {@code 3}, you can weld them together to make a support of length {@code
     * 6}.</p>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     * 	<li>{@code 1 <= rods.length <= 20}</li>
     * 	<li>{@code 1 <= rods[i] <= 1000}</li>
     * 	<li>{@code sum(rods[i]) <= 5000}</li>
     * </ul>
     *
     * @param rods a collection of {@code rods} that can be welded together.
     * @return <em>the largest possible height of your billboard installation</em>. If you cannot support the
     * billboard, return {@code 0}.
     */
    int tallestBillboard(int[] rods);
}
