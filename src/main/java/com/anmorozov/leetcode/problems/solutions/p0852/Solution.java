package com.anmorozov.leetcode.problems.solutions.p0852;

/**
 * 852. Peak Index in a Mountain Array.
 */
public interface Solution {

    /**
     * <p>An array {@code arr} a <strong>mountain</strong> if the following properties hold:</p>
     *
     * <ul>
     * 	<li>{@code arr.length >= 3}</li>
     * 	<li>There exists some {@code i} with {@code 0 < i < arr.length - 1} such that:
     * 	<ul>
     * 		<li>{@code arr[0] < arr[1] < ... < arr[i - 1] < arr[i] }</li>
     * 		<li>{@code arr[i] > arr[i + 1] > ... > arr[arr.length - 1]}</li>
     * 	</ul>
     * 	</li>
     * </ul>
     *
     * <p>Given a mountain array {@code arr}, return the index {@code i} such that {@code arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1]}.</p>
     *
     * <p>You must solve it in {@code O(log(arr.length))} time complexity.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 3 <= arr.length <= 10}<sup>5</sup></li>
     * 	<li>{@code 0 <= arr[i] <= 10}<sup>6</sup></li>
     * 	<li>{@code arr} is <strong>guaranteed</strong> to be a mountain array.</li>
     * </ul>
     *
     * @param arr a <strong>mountain</strong> array
     * @return the highest mountain index
     */
    int peakIndexInMountainArray(int[] arr);
}
