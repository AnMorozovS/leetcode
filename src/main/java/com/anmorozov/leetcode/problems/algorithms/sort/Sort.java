package com.anmorozov.leetcode.problems.algorithms.sort;

import java.util.Collection;

public interface Sort<T extends Comparable<T>> {

    Collection<T> sort(Collection<T> arr);
}
