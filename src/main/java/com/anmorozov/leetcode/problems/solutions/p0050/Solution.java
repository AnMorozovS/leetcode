package com.anmorozov.leetcode.problems.solutions.p0050;

/**
 * 50. Pow(x, n)
 */
public interface Solution {

    /**
     * <p>Implement <a href="http://www.cplusplus.com/reference/valarray/pow/" target="_blank">pow(x, n)</a>, which
     * calculates {@code x} raised to the power {@code n} (i.e., {@code x}<sup>n</sup>).</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code -100.0 < x < 100.0}</li>
     * 	<li>{@code -2}<sup>31</sup>{@code  <= n <= 2}<sup>31</sup>{@code -1}</li>
     * 	<li>{@code n} is an integer.</li>
     * 	<li>Either {@code x} is not zero or {@code n > 0}.</li>
     * 	<li>{@code -10}<sup>4</sup>{@code  <= x}<sup>n</sup>{@code  <= 10}<sup>4</sup></li>
     * </ul>
     *
     * @param x number to raise
     * @param n power
     * @return x<sup>n</sup>
     */
    double myPow(double x, int n);

}
