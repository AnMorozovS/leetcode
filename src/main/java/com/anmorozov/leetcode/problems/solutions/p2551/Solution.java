package com.anmorozov.leetcode.problems.solutions.p2551;

/**
 * <p><b>2551.</b> Put Marbles in Bags.</p>
 */
public interface Solution {

    /**
     * <p>You have {@code k} bags. You are given a <strong>0-indexed</strong> integer array {@code weights}
     * where {@code weights[i]} is the weight of the {@code i}<sup>th</sup> marble. You are also given the integer
     * {@code k.}</p>
     *
     * <p>Divide the marbles into the {@code k} bags according to the following rules:</p>
     *
     * <ul>
     * 	<li>No bag is empty.</li>
     * 	<li>If the {@code i}<sup>th</sup> marble and {@code j}<sup>th</sup> marble are in a bag, then all marbles with
     * 	an index between the {@code i}<sup>th</sup> and {@code j}<sup>th</sup> indices should also be in that same bag.</li>
     * 	<li>If a bag consists of all the marbles with an index from {@code i} to {@code j} inclusively, then the cost of
     * 	the bag is {@code weights[i] + weights[j]}.</li>
     * </ul>
     *
     * <p>The <strong>score</strong> after distributing the marbles is the sum of the costs of all the {@code k} bags.</p>
     *
     * <p>Return <em>the <strong>difference</strong> between the <strong>maximum</strong> and <strong>minimum</strong>
     * scores among marble distributions</em>.</p>
     *
     * <p>&nbsp;</p>
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= k <= weights.length <= 10}<sup>5</sup></li>
     * 	<li>{@code 1 <= weights[i] <= 10}<sup>9</sup></li>
     * </ul>
     *
     * @param weights <strong>0-indexed</strong> integer array {@code weights} where {@code weights[i]} is the weight of
     * the {@code i}<sup>th</sup> marble
     * @param k bags number
     * @return <em>the <strong>difference</strong> between the <strong>maximum</strong> and <strong>minimum</strong>
     * scores among marble distributions</em>.
     */
    long putMarbles(int[] weights, int k);
}
