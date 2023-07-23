package com.anmorozov.leetcode.common;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Cache<E, T> {

    private final Map<E, T> cache;

    public Cache() {
        this.cache = new HashMap<>();
    }

    public T useCache(E parameter, Function<E, T> function) {
        if (!cache.containsKey(parameter)) {
            cache.put(parameter, function.apply(parameter));
        }
        return cache.get(parameter);
    }
}
