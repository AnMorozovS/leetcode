package com.anmorozov.leetcode.problems.solutions.p0137;

/**
 * <p><b>137.</b> Single Number II</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>Given an integer array  {@code nums} where every element appears <strong>three times</strong> except for one,
     * which appears <strong>exactly once</strong>. <em>Find the single element and return it</em>.</p>
     *
     * <p>You must implement a solution with a linear runtime complexity and use only constant extra
     * space.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li> {@code 1  <= nums.length  <= 3 * 10}<sup>4</sup></li>
     * 	<li> {@code -2}<sup>31</sup>{@code   <= nums[i]  <= 2}<sup>31</sup>{@code  - 1}</li>
     * 	<li>Each element in  {@code nums} appears exactly <strong>three times</strong> except for one element which appears <strong>once</strong>.</li>
     * </ul>
     *
     * @param nums an integer array where every element appears <strong>three times</strong> except for one which
     * appears <strong>exactly once</strong>
     * @return single element
     */
    int singleNumber(int[] nums);
}
