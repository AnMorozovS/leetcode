package com.anmorozov.leetcode.problems.solutions.p0787;

record Flight(int from, int to, int price) {

    Flight(int[] flight) {
        this(flight[0], flight[1], flight[2]);

    }
}
