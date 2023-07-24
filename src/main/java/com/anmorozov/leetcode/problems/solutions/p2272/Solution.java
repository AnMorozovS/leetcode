package com.anmorozov.leetcode.problems.solutions.p2272;

/**
 * <p><b>2272.</b> Substring With Largest Variance.</p>
 */
public interface Solution {

    /**
     * <p>The <strong>variance</strong> of a string is defined as the largest difference between the number of
     * occurrences of <strong>any</strong> {@code 2} characters present in the string. Note the two characters may or
     * may not be the same.</p>
     *
     * <p>Given a string {@code s} consisting of lowercase English letters only, return <em>the <strong>largest
     * variance</strong> possible among all <strong>substrings</strong> of</em> {@code s}.</p>
     *
     * <p>A <strong>substring</strong> is a contiguous sequence of characters within a string.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= s.length <= 10}<sup>4</sup></li>
     * 	<li>{@code s} consists of lowercase English letters.</li>
     * </ul>
     *
     * @param s s
     * @return 0
     */
    int largestVariance(String s);

}
