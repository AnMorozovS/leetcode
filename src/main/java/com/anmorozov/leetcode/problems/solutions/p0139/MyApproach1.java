package com.anmorozov.leetcode.problems.solutions.p0139;

import com.anmorozov.leetcode.common.Cache;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * My Approach 1: Cache.
 */
public class MyApproach1 implements Solution {

    private NavigableMap<Integer, Set<String>> dictionaryBySize;
    private Cache<String, Boolean> cache;

    @Override
    public boolean wordBreak(String s, List<String> wordDict) {
        dictionaryBySize = new TreeMap<>();
        cache = new Cache<>();
        SortedSet<String> wordsSet = new TreeSet<>(wordDict);
        for (String word : wordsSet) {
            if (!checkStringStart(word)) {
                dictionaryBySize.computeIfAbsent(word.length(), HashSet::new).add(word);
            }
        }

        cache = new Cache<>();
        return cache.useCache(s, this::checkStringStart);
    }

    private boolean checkStringStart(String s) {
        if (s.isBlank()) {
            return true;
        }
        for (int wordLength : dictionaryBySize.descendingKeySet()) {
            if (wordLength <= s.length()) {
                String currentWord = s.substring(0, wordLength);
                if (dictionaryBySize.get(wordLength).contains(currentWord)) {
                    if (cache.useCache(s.substring(wordLength), this::checkStringStart)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
