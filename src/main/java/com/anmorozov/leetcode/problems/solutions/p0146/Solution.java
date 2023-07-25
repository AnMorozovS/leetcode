package com.anmorozov.leetcode.problems.solutions.p0146;

/**
 * 146. LRU Cache
 *
 * @param <T> use for different cache realisations
 */
public interface Solution<T extends LRUCache> {

    T getNewInstance();

    /**
     * <p>Design a data structure that follows the constraints of a <strong><a href="https://en.wikipedia.org/wiki/Cache_replacement_policies#LRU"
     * target="_blank">Least Recently Used (LRU) cache</a></strong>.</p>
     *
     * <p>Implement the {@code LRUCache} class:</p>
     *
     * <ul>
     * 	<li>{@code LRUCache(int capacity)} Initialize the LRU cache with <strong>positive</strong> size {@code capacity}.</li>
     * 	<li>{@code int get(int key)} Return the value of the {@code key} if the key exists, otherwise return {@code -1}.</li>
     * 	<li>{@code void put(int key, int value)} Update the value of the {@code key} if the {@code key} exists. Otherwise, add the {@code key-value} pair to the cache. If the number of keys exceeds the {@code capacity} from this operation, <strong>evict</strong> the least recently used key.</li>
     * </ul>
     *
     * <p>The functions {@code get} and {@code put} must each run in {@code O(1)} average time complexity.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= capacity <= 3000}</li>
     * 	<li>{@code 0 <= key <= 10}<sup>4</sup></li>
     * 	<li>{@code 0 <= value <= 10}<sup>5</sup></li>
     * 	<li>At most {@code 2 * 10}<sup>5</sup> calls will be made to {@code get} and {@code put}.</li>
     * </ul>
     */
    default Integer[] useLRUCache(String[] methods, int[][] parameters) {
        Integer[] result = new Integer[methods.length];
        T cache = getNewInstance();
        for (int i = 0; i < methods.length; i++) {
            String methodName = methods[i];
            switch (methodName) {
                case "get" -> result[i] = cache.get(parameters[i][0]);
                case "put" -> {
                    cache.put(parameters[i][0], parameters[i][1]);
                    result[i] = null;
                }
                default -> throw new RuntimeException("Unknown method " + methodName);
            }
        }
        return result;
    }

}

