package com.anmorozov.leetcode.problems.solutions.p1466;

enum Direction {
    FORWARD(1),
    BACKWARD(0);
    private final int sign;

    Direction(int sign) {
        this.sign = sign;
    }

    public int getSign() {
        return sign;
    }
}
