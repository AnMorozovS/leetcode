package com.anmorozov.leetcode.problems.solutions.p1970;

public class MyApproach1 implements Solution {

    private int[][] land;
    private int rowsCount;
    private int columnsCount;
    private UnionFind unionFind;

    @Override
    public int latestDayToCross(int row, int col, int[][] cells) {
        land = new int[row][col];
        rowsCount = row;
        columnsCount = col;
        unionFind = new UnionFind(row, col);
        int resultDay = 0;
        for (int i = cells.length - 1; i >= 0; i--) {
            if (dryCell(cells[i][0] - 1, cells[i][1] - 1)) {
                resultDay = i;
                break;
            }
        }
        return resultDay;
    }

    private boolean dryCell(int x, int y) {
        land[x][y] = 1;
        if (unionWith(x, y, x + 1, y)) {
            return true;
        }
        if (unionWith(x, y, x - 1, y)) {
            return true;
        }
        if (unionWith(x, y, x, y + 1)) {
            return true;
        }
        return unionWith(x, y, x, y - 1);
    }

    private boolean unionWith(int x0, int y0, int x1, int y1) {
        if (x1 < 0 || x1 >= rowsCount || y1 < 0 || y1 >= columnsCount) {
            return false;
        }
        if (land[x1][y1] == 0) {
            return false;
        }
        return unionFind.union(x1, y1, x0, y0);
    }

    static class UnionFind {

        private final int[][] land;
        private final int columnsCount;
        private final int rowsCount;

        public UnionFind(int row, int col) {
            this.columnsCount = col;
            this.rowsCount = row;
            this.land = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    this.land[i][j] = i * columnsCount + j;
                }
            }
        }

        public int find(int x, int y) {
            int cellValue = this.land[x][y];
            int cellValueX = cellValue / this.columnsCount;
            int cellValueY = cellValue % this.columnsCount;
            if (cellValueX == x && cellValueY == y) {
                return cellValue;
            } else {
                int result = find(cellValueX, cellValueY);
                this.land[x][y] = result;
                return result;
            }
        }

        public boolean union(int x1, int y1, int x2, int y2) {
            int result1 = find(x1, y1);
            int result1ValueX = result1 / this.columnsCount;
            int result1ValueY = result1 % this.columnsCount;
            int result2 = find(x2, y2);
            int result2ValueX = result2 / this.columnsCount;
            int result2ValueY = result2 % this.columnsCount;

            if (result1ValueX == 0 && result2ValueX == rowsCount - 1) {
                return true;
            } else if (result1ValueX == rowsCount - 1 && result2ValueX == 0) {
                return true;
            } else if (result1ValueX == 0) {
                this.land[result2ValueX][result2ValueY] = result1;
            } else if (result2ValueX == 0) {
                this.land[result1ValueX][result1ValueY] = result2;
            } else if (result1ValueX == rowsCount - 1) {
                this.land[result2ValueX][result2ValueY] = result1;
            } else if (result2ValueX == rowsCount - 1) {
                this.land[result1ValueX][result1ValueY] = result2;
            } else {
                this.land[result2ValueX][result2ValueY] = result1;
            }
            return false;
        }
    }
}
