package com.anmorozov.leetcode.problems.solutions.p0139;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Approach 4: Trie Optimization
 */
public class Approach4 implements Solution {

    @Override
    public boolean wordBreak(String s, List<String> wordDict) {
        TrieNode root = new TrieNode();
        for (String word : wordDict) {
            TrieNode curr = root;
            for (char c : word.toCharArray()) {
                if (!curr.getChildren().containsKey(c)) {
                    curr.getChildren().put(c, new TrieNode());
                }

                curr = curr.getChildren().get(c);
            }

            curr.setWord(true);
        }

        boolean[] dp = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || dp[i - 1]) {
                TrieNode curr = root;
                for (int j = i; j < s.length(); j++) {
                    char c = s.charAt(j);
                    if (!curr.getChildren().containsKey(c)) {
                        // No words exist
                        break;
                    }

                    curr = curr.getChildren().get(c);
                    if (curr.isWord()) {
                        dp[j] = true;
                    }
                }
            }
        }

        return dp[s.length() - 1];
    }

    @Getter
    @Setter
    static class TrieNode {

        private final Map<Character, TrieNode> children;
        private boolean isWord;

        TrieNode() {
            this.children = new HashMap<>();
        }
    }
}
