package com.anmorozov.leetcode.problems.solutions.p0097;

/**
 * <p><strong>97.</strong> Interleaving String.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>Given strings {@code s1}, {@code s2}, and {@code s3}, find whether {@code s3} is formed by an <strong>interleaving</strong> of {@code s1} and {@code s2}.</p>
     *
     * <p>An <strong>interleaving</strong> of two strings {@code s} and {@code t} is a configuration where {@code s} and {@code t} are divided into {@code n} and {@code m} substrings respectively, such that:</p>
     *
     * <ul>
     * 	<li>{@code s = s}<sub>1</sub>{@code  + s}<sub>2</sub>{@code  + ... + s}<sub>n</sub></li>
     * 	<li>{@code t = t}<sub>1</sub>{@code  + t}<sub>2</sub>{@code  + ... + t}<sub>m</sub></li>
     * 	<li>{@code |n - m| <= 1}</li>
     * 	<li>The <strong>interleaving</strong> is s<sub>1</sub> + t<sub>1</sub> + s<sub>2</sub> + t<sub>2</sub> + s<sub>3</sub> + t<sub>3</sub>{@code  + ...} or {@code t}<sub>1</sub> + s<sub>1</sub> + t<sub>2</sub> + s<sub>2</sub> + t<sub>3</sub> + s<sub>3</sub>{@code  + ...}</li>
     * </ul>
     *
     * <p><strong>Note:</strong> {@code a + b} is the concatenation of strings {@code a} and {@code b}.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 0 <= s1.length, s2.length <= 100}</li>
     * 	<li>{@code 0 <= s3.length <= 200}</li>
     * 	<li>{@code s1}, {@code s2}, and {@code s3} consist of lowercase English letters.</li>
     * </ul>
     *
     * @param s1 first string
     * @param s2 second string
     * @param s3 interleaving string
     * @return {@code s3} is formed by an <strong>interleaving</strong> of {@code s1} and {@code s2}
     */
    boolean isInterleave(String s1, String s2, String s3);
}
