package com.anmorozov.leetcode.problems.solutions.p0714;

import java.util.ArrayList;
import java.util.List;

public class MyApproach2 implements Solution {

    @Override
    public int maxProfit(int[] prices, int fee) {
        List<Integer> array = new ArrayList<>();
        for (int price : prices) {
            maxProfit(price, array);
        }
        int result = 0;
        int previous = 0;
        for (int i = 0; i < array.size(); i++) {
            if (i % 2 == 1) {
                int tmp = array.get(i) - previous - fee;
                if (tmp > 0) {
                    result = result + tmp;
                }
            }
            previous = array.get(i);
        }
        return result;
    }

    public void maxProfit(int price, List<Integer> readyArray) {
        int arraySize = readyArray.size();
        if (readyArray.isEmpty()) {
            readyArray.add(price);
        } else if (arraySize % 2 == 1) {
            if (readyArray.get(arraySize - 1) < price) {
                if (arraySize >= 2) {
                    if (readyArray.get(arraySize - 2) < price) {
                        readyArray.remove(arraySize - 1);
                        maxProfit(price, readyArray);
                    }
                }
                readyArray.add(price);
            } else {
                readyArray.remove(arraySize - 1);
                maxProfit(price, readyArray);
            }
        } else {
            if (readyArray.get(arraySize - 1) > price) {
                readyArray.add(price);
            } else {
                readyArray.remove(arraySize - 1);
                maxProfit(price, readyArray);
            }
        }
    }
}
