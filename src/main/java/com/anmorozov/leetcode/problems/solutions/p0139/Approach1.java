package com.anmorozov.leetcode.problems.solutions.p0139;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * Approach 1: Breadth-First Search
 */
public class Approach1 implements Solution {

    @Override
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> words = new HashSet<>(wordDict);
        Queue<Integer> queue = new LinkedList<>();
        boolean[] seen = new boolean[s.length() + 1];
        queue.add(0);

        while (!queue.isEmpty()) {
            int start = queue.remove();
            if (start == s.length()) {
                return true;
            }

            for (int end = start + 1; end <= s.length(); end++) {
                if (seen[end]) {
                    continue;
                }

                if (words.contains(s.substring(start, end))) {
                    queue.add(end);
                    seen[end] = true;
                }
            }
        }

        return false;
    }
}
