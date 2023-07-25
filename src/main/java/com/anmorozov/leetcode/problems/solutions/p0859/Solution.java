package com.anmorozov.leetcode.problems.solutions.p0859;

/**
 * <p><b>859.</b> Buddy Strings.</p>
 * <i>Easy</i>
 */
public interface Solution {

    /**
     * <p>Given two strings {@code s} and {@code goal}, return {@code true}<em> if you can swap two
     * letters in </em>{@code s}<em> so the result is equal to </em>{@code goal}<em>, otherwise, return
     * </em>{@code false}<em>.</em></p>
     *
     * <p>Swapping letters is defined as taking two indices {@code i} and {@code j} (0-indexed) such that
     * {@code i != j} and swapping the characters at {@code s[i]} and {@code s[j]}.</p>
     *
     * <ul>
     * 	<li>For example, swapping at indices <code>0</code> and <code>2</code> in <code>"abcd"</code> results in <code>"cbad"</code>.</li>
     * </ul>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= s.length, goal.length <= 2 * 10}<sup>4</sup></li>
     * 	<li>{@code s} and {@code goal} consist of lowercase letters.</li>
     * </ul>
     *
     * @param s incoming string
     * @param goal goal string
     * @return return {@code true}<em> if you can swap two letters in </em>{@code s}<em> so the result is equal to</em>
     * {@code goal}<em>, otherwise, return </em>{@code false}
     */
    boolean buddyStrings(String s, String goal);
}
