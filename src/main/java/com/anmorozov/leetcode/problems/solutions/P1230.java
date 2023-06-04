package com.anmorozov.leetcode.problems.solutions;

import java.util.HashMap;
import java.util.Map;

public class P1230 {

    private double[] prob;
    private int target;
    private Map<Integer, Map<Integer, Double>> cash;

    public double probabilityOfHeads(double[] prob, int target) {
        this.prob = prob;
        this.target = target;
        this.cash = new HashMap<>();
        return tossCoin(0, 0);
    }


    public double tossCoin(int tossNumber, int headToss) {
        if (tossNumber >= this.prob.length) {
            return 1d;
        }
        double result = 0d;
        if (headToss < this.target) {
            result = result + (this.prob[tossNumber] * useCash(tossNumber + 1, headToss + 1));
        }
        if ((tossNumber - headToss) < (this.prob.length - this.target)) {
            result = result + ((1 - this.prob[tossNumber]) * useCash(tossNumber + 1, headToss));
        }
        return result;
    }

    private double useCash(int nextTossNumber, int nextHeadNumber) {
        double result;
        if (cash.computeIfAbsent(nextHeadNumber, x -> new HashMap<>()).containsKey(nextTossNumber)) {
            result = cash.get(nextHeadNumber).get(nextTossNumber);
        } else {
            result = tossCoin(nextTossNumber, nextHeadNumber);
            cash.computeIfAbsent(nextHeadNumber, x -> new HashMap<>()).put(nextTossNumber, result);
        }
        return result;
    }
}
