package com.anmorozov.leetcode.problems.solutions;

/**
 * 1732. Find the Highest Altitude.
 */
public class P1732 {

    /**
     * <p>There is a biker going on a road trip. The road trip consists of {@code n + 1} points at different altitudes.
     * The biker starts his trip on point {@code 0} with altitude equal {@code 0}.</p>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *     <li>{@code n == gain.length}</li>
     *     <li>{@code 1 <= n <= 100}</li>
     *     <li>{@code -100 <= gain[i] <= 100}</li>
     * </ul>
     *
     * @param gain an integer array of length {@code n} where {@code gain[i]} is the <b>net gain in altitude</b> between
     * points {@code i} and {@code i + 1} for all ({@code 0 <= i < n}).
     * @return the <b>highest altitude</b> of a point.
     */
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = currentAltitude;
        for (int dif : gain) {
            currentAltitude = currentAltitude + dif;
            if (maxAltitude < currentAltitude) {
                maxAltitude = currentAltitude;
            }
        }
        return maxAltitude;
    }
}
