package com.anmorozov.leetcode.problems.algorithms.sort.noncomparison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort implements NonComparisonSort {

    private final int bucketNumber;

    public BucketSort(int bucketNumber) {
        this.bucketNumber = bucketNumber;
    }

    @Override
    public void sort(int[] arr) {
        List<List<Integer>> buckets = new ArrayList<>(bucketNumber);
        int shift = Arrays.stream(arr).min().orElse(0);
        int maxValue = Arrays.stream(arr).max().orElse(0) - shift;
        // place elements into buckets
        double bucketSize = (double) maxValue / bucketNumber;
        if (bucketSize < 1) {
            bucketSize = 1.0;
        }
        for (int i = 0; i < bucketNumber; i++) {
            buckets.add(new ArrayList<>());
        }
        for (int elem : arr) {
            // same as bucketNumber * arr[i] / max(lst)
            int index = (int) ((elem - shift) / bucketSize);
            if (index == bucketNumber) {
                // put the max value in the last bucket
                buckets.get(bucketNumber - 1).add(elem);
            } else {
                buckets.get(index).add(elem);
            }
        }

        // sort individual buckets
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        // convert sorted buckets into final output
        List<Integer> sortedList = new ArrayList<>();
        for (List<Integer> bucket : buckets) {
            sortedList.addAll(bucket);
        }

        // perfectly fine to just return sortedList here
        // but common practice is to mutate original array with sorted elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sortedList.get(i);
        }
    }
}
