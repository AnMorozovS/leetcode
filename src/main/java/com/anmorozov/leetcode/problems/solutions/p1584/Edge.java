package com.anmorozov.leetcode.problems.solutions.p1584;

record Edge(int node1, int node2, int weight) implements Comparable<Edge> {

    @Override
    public int compareTo(Edge o) {
        return this.weight - o.weight;
    }
}
