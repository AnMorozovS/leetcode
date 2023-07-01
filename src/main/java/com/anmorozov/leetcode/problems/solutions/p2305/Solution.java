package com.anmorozov.leetcode.problems.solutions.p2305;

/**
 * <p><b>2305.</b> Fair Distribution of Cookies</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>You are given an integer array {@code cookies}, where {@code cookies[i]} denotes the number of
     * cookies in the {@code i}<sup>th</sup> bag. You are also given an integer {@code k} that denotes the number of
     * children to distribute <strong>all</strong> the bags of cookies to. All the cookies in the same bag must go to
     * the same child and cannot be split up.</p>
     *
     * <p>The <strong>unfairness</strong> of a distribution is defined as the <strong>maximum</strong>
     * <strong>total</strong> cookies obtained by a single child in the distribution.</p>
     *
     * <p>&nbsp;</p>
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 2 <= cookies.length <= 8}</li>
     * 	<li>{@code 1 <= cookies[i] <= 10}<sup>5</sup></li>
     * 	<li>{@code 2 <= k <= cookies.length}</li>
     * </ul>
     *
     * @param cookies where {@code cookies[i]} denotes the number of cookies in the {@code i}<sup>th</sup> bag.
     * @param k denotes the number of children to distribute <strong>all</strong> the bags of cookies to.
     * @return <em>the <strong>minimum</strong> unfairness of all distributions</em>
     */
    int distributeCookies(int[] cookies, int k);
}
