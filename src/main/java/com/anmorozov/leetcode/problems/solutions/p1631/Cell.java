package com.anmorozov.leetcode.problems.solutions.p1631;

record Cell(int x, int y, Integer difference) implements Comparable<Cell> {

    @Override
    public int compareTo(Cell o) {
        return difference - o.difference();
    }
}
