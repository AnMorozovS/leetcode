package com.anmorozov.leetcode.problems.solutions.p0373;

import java.util.List;

/**
 * <p><b>373.</b> Find K Pairs with Smallest Sums</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>You are given two integer arrays {@code nums1} and {@code nums2} sorted in <strong>ascending order</strong>
     * and an integer {@code k}.</p>
     *
     * <p>Define a pair {@code (u, v)} which consists of one element from the first array and one element from the
     * second array.</p>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     * <li>{@code 1 <= nums1.length, nums2.length <= 10}<sup>5</sup></li>
     * <li>{@code -10}<sup>9</sup>{@code  <= nums1[i], nums2[i] <= 10}<sup>9</sup></li>
     * <li>{@code nums1} and {@code nums2} both are sorted in <strong>ascending order</strong>.</li>
     * <li>{@code 1 <= k <= 10}<sup>4</sup></li>
     * </ul>
     *
     * @param nums1 integer array sorted in <strong>ascending order</strong>
     * @param nums2 integer array sorted in <strong>ascending order</strong>
     * @param k pairs to return
     * @return <em>the</em> {@code k} <em>pairs</em> {@code (u}<sub>1</sub>{@code , v}<sub>1</sub>{@code ),
     * (u}<sub>2</sub>{@code , v}<sub>2</sub>{@code ), ..., (u}<sub>k</sub>{@code , v}<sub>k</sub>{@code )} <em>with the
     * smallest sums</em>.
     */
    List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k);
}
