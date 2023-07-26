package com.anmorozov.leetcode.problems.solutions.p0146;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLRUCache extends LRUCache {

    final LinkedHashMap<Integer, Integer> dictionary;

    public MyLRUCache(int capacity) {
        dictionary = new LinkedHashMap<>(5, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    @Override
    @SuppressWarnings("NewMethodNamingConvention")
    public int get(int key) {
        return dictionary.getOrDefault(key, -1);
    }

    @Override
    @SuppressWarnings("NewMethodNamingConvention")
    public void put(int key, int value) {
        dictionary.put(key, value);
    }
}
