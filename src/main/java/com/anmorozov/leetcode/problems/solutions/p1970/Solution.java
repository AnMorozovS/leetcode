package com.anmorozov.leetcode.problems.solutions.p1970;

/**
 * <p><strong>1970.</strong> Last Day "Where" You Can Still Cross Hard
 */
public interface Solution {

    /**
     * <p>There is a <strong>1-based</strong> binary matrix where {@code 0} represents land and {@code 1} represents
     * water. You are given integers {@code row} and {@code col} representing the number of rows and columns in the
     * matrix, respectively.</p>
     *
     * <p>Initially on day {@code 0}, the <strong>entire</strong> matrix is <strong>land</strong>. However, each
     * day a new cell becomes flooded with <strong>water</strong>. You are given a <strong>1-based</strong> 2D array
     * {@code cells}, where {@code cells[i] = [r}<sub>i</sub>{@code , c}<sub>i</sub>} represents that on the {@code
     * i<sup>th</sup>} day, the cell on the {@code r}<sub>i</sub><sup>th</sup> row and {@code
     * c}<sub>i</sub><sup>th</sup> column (<strong>1-based</strong> coordinates) will be covered with
     * <strong>water</strong> (i.e., changed to {@code 1}).</p>
     *
     * <p>You want to find the <strong>last</strong> day that it is possible to walk from the <strong>top</strong> to
     * the <strong>bottom</strong> by only walking on land cells. You can start from <strong>any</strong> cell in the
     * top row and end at <strong>any</strong> cell in the bottom row. You can only travel in the<strong> four</strong>
     * cardinal directions (left, right, up, and down).</p>
     *
     * <p>Return <em>the <strong>last</strong> day where it is possible to walk from the <strong>top</strong> to the
     * <strong>bottom</strong> by only walking on land cells</em>.</p>
     * <p>&nbsp;</p>
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 2 <= row, col <= 2 * 10<sup>4</sup>}</li>
     * 	<li>{@code 4 <= row * col <= 2 * 10<sup>4</sup>}</li>
     * 	<li>{@code cells.length == row * col}</li>
     * 	<li>{@code 1 <= r}<sub>i</sub>{@code  <= row}</li>
     * 	<li>{@code 1 <= c}<sub>i</sub>{@code  <= col}</li>
     * 	<li>All the values of {@code cells} are <strong>unique</strong>.</li>
     * </ul>
     *
     * @param row row
     * @param col column
     * @param cells cells
     * @return int
     */
    int latestDayToCross(int row, int col, int[][] cells);
}
