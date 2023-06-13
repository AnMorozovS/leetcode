package com.anmorozov.leetcode.problems.solutions;

import java.util.ArrayList;
import java.util.List;

public class P0228 {

    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) {
            return list;
        } else if (nums.length == 1) {
            return List.of(String.valueOf(nums[0]));
        }
        int startValue = nums[0];
        int endValue = nums[0];
        int previousValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != previousValue + 1) {
                if (startValue == endValue) {
                    list.add(String.valueOf(startValue));
                } else {
                    list.add(startValue + "->" + endValue);
                }
                startValue = nums[i];
            }
            endValue = nums[i];
            previousValue = nums[i];
        }

        if (startValue == endValue) {
            list.add(String.valueOf(startValue));
        } else {
            list.add(startValue + "->" + endValue);
        }

        return list;
    }
}
