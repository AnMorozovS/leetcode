package com.anmorozov.leetcode.problems.solutions.p0920;

/**
 * <p><strong>920.</strong> Number of Music Playlists.</p>
 * <em>Hard</em>
 */
public interface Solution {

    /**
     * <p>Your music player contains {@code n} different songs. You want to listen to {@code goal} songs (not
     * necessarily different) during your trip. To avoid boredom, you will create a playlist so that:</p>
     *
     * <ul>
     * 	<li>Every song is played <strong>at least once</strong>.</li>
     * 	<li>A song can only be played again only if {@code k} other songs have been played.</li>
     * </ul>
     *
     * <p>Given {@code n}, {@code goal}, and {@code k}, return <em>the number of possible playlists that you can create</em>. Since the answer can be very large, return it <strong>modulo</strong> {@code 10}<sup>9</sup>{@code + 7}.</p>
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 0 <= k < n <= goal <= 100}</li>
     * </ul>
     *
     * @param n different songs
     * @param goal songs to listen
     * @param k song can only be played again only if {@code k} other songs have been played.
     * @return <em>the number of possible playlists that you can create</em>
     */
    int numMusicPlaylists(int n, int goal, int k);

}
