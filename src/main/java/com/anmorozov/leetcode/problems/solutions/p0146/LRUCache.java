package com.anmorozov.leetcode.problems.solutions.p0146;

/**
 * Your LRUCache object will be instantiated and called as such: LRUCache obj = new LRUCache(capacity); int param_1 =
 * obj.get(key); obj.put(key,value);
 */
public abstract class LRUCache {

    @SuppressWarnings("NewMethodNamingConvention")
    public abstract int get(int key);

    @SuppressWarnings("NewMethodNamingConvention")
    public abstract void put(int key, int value);


}

