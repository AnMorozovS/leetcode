package com.anmorozov.leetcode.problems.solutions.p0269;

/**
 * <p><strong>269.</strong> Alien Dictionary.</p>
 * <em>Hard</em>
 */
public interface Solution {

    /**
     * <p>There is a new alien language that uses the English alphabet. However, the order of the letters is unknown to
     * you.</p>
     *
     * <p>You are given a list of strings {@code words} from the alien language's dictionary. Now it is claimed that
     * the strings in {@code words} are <strong>sorted lexicographically</strong> by the rules of this new
     * language.</p>
     *
     * <p>If this claim is incorrect, and the given arrangement of string in {@code words} cannot correspond to any
     * order of letters, return {@code "".}</p>
     *
     * <p>Otherwise, return <em>a string of the unique letters in the new alien language sorted in
     * <strong>lexicographically increasing order</strong> by the new language's rules. </em>If there are multiple
     * solutions, return<em> <strong>any of them</strong></em>.</p>
     * <p><strong>Constraints:</strong></p>
     * <ul>
     * 	<li>{@code 1 <= words.length <= 100}</li>
     * 	<li>{@code 1 <= words[i].length <= 100}</li>
     * 	<li>{@code words[i]} consists of only lowercase English letters.</li>
     * </ul>
     *
     * @param words alien language's dictionary
     * @return <em>a string of the unique letters in the new alien language sorted in <strong>lexicographically
     * increasing order</strong> by the new language's rules. </em>
     */
    String alienOrder(String[] words);
}
