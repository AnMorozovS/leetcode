package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.problems.algorithms.UnionFind;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class P1202 {

    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        UnionFind unionFind = new UnionFind(n);
        for (List<Integer> pair : pairs) {
            int i = pair.get(0);
            int j = pair.get(1);
            if (unionFind.find(i) != unionFind.find(j)) {
                unionFind.union(i, j);
            }
        }
        Map<Integer, PriorityQueue<Character>> groupCharsQueue = new HashMap<>();
        for (int i = 0; i < n; i++) {
            groupCharsQueue.computeIfAbsent(unionFind.find(i), x -> new PriorityQueue<>()).add(chars[i]);
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(groupCharsQueue.get(unionFind.find(i)).poll());
        }
        return builder.toString();
    }
}
