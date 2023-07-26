package com.anmorozov.leetcode.problems.solutions.p1129;

public enum EdgeColor {
    RED_COLOR,
    BLUE_COLOR;

    public EdgeColor nextColor() {
        if (this == EdgeColor.RED_COLOR) {
            return BLUE_COLOR;
        }
        return RED_COLOR;
    }
}
