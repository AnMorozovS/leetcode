package com.anmorozov.leetcode.problems.algorithms.sort.comparison;

import java.util.Collection;

public interface ComparisonSort<T extends Comparable<T>> {

    Collection<T> sort(Collection<T> arr);
}
