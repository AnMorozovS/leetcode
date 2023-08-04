package com.anmorozov.leetcode.problems.solutions.p0139;

import java.util.List;

/**
 * <p><strong>139.</strong> Word Break.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>Given a string {@code s} and a dictionary of strings {@code wordDict}, return {@code true} if {@code s} can
     * be segmented into a space-separated sequence of one or more dictionary words.</p>
     *
     * <p><strong>Note</strong> that the same word in the dictionary may be reused multiple times in the
     * segmentation.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= s.length <= 300}</li>
     * 	<li>{@code 1 <= wordDict.length <= 1000}</li>
     * 	<li>{@code 1 <= wordDict[i].length <= 20}</li>
     * 	<li>{@code s} and {@code wordDict[i]} consist of only lowercase English letters.</li>
     * 	<li>All the strings of {@code wordDict} are <strong>unique</strong>.</li>
     * </ul>
     *
     * @param s a string
     * @param wordDict a dictionary of strings
     * @return {@code true} if {@code s} can be segmented into a space-separated sequence of one or more dictionary
     * words.
     */
    boolean wordBreak(String s, List<String> wordDict);
}
