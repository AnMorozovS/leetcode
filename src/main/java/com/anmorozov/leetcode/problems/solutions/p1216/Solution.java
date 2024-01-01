package com.anmorozov.leetcode.problems.solutions.p1216;

/**
 * <p><strong>1216.</strong> Valid Palindrome III.</p>
 * <em>Hard</em>
 */
public interface Solution {

    /**
     * <p>Given a string {@code s} and an integer {@code k}, return {@code true} if {@code s} is a {@code k}<strong>-palindrome</strong>.</p>
     *
     * <p>A string is {@code k}<strong>-palindrome</strong> if it can be transformed into a palindrome by removing at most {@code k} characters from it.</p>
     *
     * <p><strong>Example 1:</strong></p>
     *
     * <pre><strong>Input:</strong> s = "abcdeca", k = 2
     * <strong>Output:</strong> true
     * <strong>Explanation:</strong> Remove 'b' and 'e' characters.
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     *
     * <pre><strong>Input:</strong> s = "abbababa", k = 1
     * <strong>Output:</strong> true
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * <li>{@code 1 <= s.length <= 1000}</li>
     * <li>{@code s} consists of only lowercase English letters.</li>
     * <li>{@code 1 <= k <= s.length}</li>
     * </ul>
     *
     * @param s string
     * @param k max number of removing characters
     * @return return true if {@code s} is a {@code k}<strong>-palindrome</strong>
     */
    boolean isValidPalindrome(String s, int k);

}
