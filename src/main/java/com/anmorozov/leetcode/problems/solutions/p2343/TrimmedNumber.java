package com.anmorozov.leetcode.problems.solutions.p2343;

public record TrimmedNumber(int index, String value) implements Comparable<TrimmedNumber> {

    @Override
    public int compareTo(TrimmedNumber o) {
        return this.value().compareTo(o.value());
    }
}
