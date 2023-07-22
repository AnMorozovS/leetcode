package com.anmorozov.leetcode.problems.solutions.p0688;

/**
 * <p><b>688.</b> Knight Probability in Chessboard.</p>
 * <i>Medium</i>
 */
public interface Solution {

    int[][] DIRECTIONS = {{1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {2, 1}, {2, -1}, {-2, 1}, {-2, -1}};

    /**
     * <p>On an {@code n x n} chessboard, a knight starts at the cell {@code (row, column)} and attempts to make
     * exactly
     * {@code k} moves. The rows and columns are <strong>0-indexed</strong>, so the top-left cell is {@code (0, 0)}, and
     * the bottom-right cell is {@code (n - 1, n - 1)}.</p>
     *
     * <p>A chess knight has eight possible moves it can make, as illustrated below. Each move is two cells in a
     * cardinal direction, then one cell in an orthogonal direction.</p>
     * <p>Each time the knight is to move, it chooses one of eight possible moves uniformly at random (even if the
     * piece
     * would go off the chessboard) and moves there.</p>
     *
     * <p>The knight continues moving until it has made exactly {@code k} moves or has moved off the chessboard.</p>
     *
     * <p>Return <em>the probability that the knight remains on the board after it has stopped moving</em>.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= n <= 25}</li>
     * 	<li>{@code 0 <= k <= 100}</li>
     * 	<li>{@code 0 <= row, column <= n - 1}</li>
     * </ul>
     *
     * @param n an {@code n x n} chessboard
     * @param k moves
     * @param row a knight starts at {@code row}
     * @param column a knight starts at {@code column}
     * @return <em>the probability that the knight remains on the board after it has stopped moving</em>
     */
    double knightProbability(int n, int k, int row, int column);
}
