package com.anmorozov.leetcode.problems.solutions.p2483;

/**
 * <p><strong>2483.</strong> Minimum Penalty for a Shop.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>You are given the customer visit log of a shop represented by a <strong>0-indexed</strong> string {@code customers} consisting only of characters {@code 'N'} and {@code 'Y'}:</p>
     *
     * <ul>
     * 	<li>if the {@code i}<sup>th</sup> character is {@code 'Y'}, it means that customers come at the {@code i}<sup>th</sup> hour</li>
     * 	<li>whereas {@code 'N'} indicates that no customers come at the {@code i}<sup>th</sup> hour.</li>
     * </ul>
     *
     * <p>If the shop closes at the {@code j}<sup>th</sup> hour ({@code 0 <= j <= n}), the <strong>penalty</strong> is calculated as follows:</p>
     *
     * <ul>
     * 	<li>For every hour when the shop is open and no customers come, the penalty increases by {@code 1}.</li>
     * 	<li>For every hour when the shop is closed and customers come, the penalty increases by {@code 1}.</li>
     * </ul>
     *
     * <p>Return<em> the <strong>earliest</strong> hour at which the shop must be closed to incur a <strong>minimum</strong> penalty.</em></p>
     *
     * <p><strong>Note</strong> that if a shop closes at the {@code j}<sup>th</sup> hour, it means the shop is closed at the hour {@code j}.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= customers.length <= 10}<sup>5</sup></li>
     * 	<li>{@code customers} consists only of characters {@code 'Y'} and {@code 'N'}.</li>
     * </ul>
     *
     * @param customers string {@code customers} consisting only of characters {@code 'N'} and {@code 'Y'}
     * @return <em> the <strong>earliest</strong> hour at which the shop must be closed to incur a <strong>minimum</strong> penalty.</em>
     */
    int bestClosingTime(String customers);
}
