package com.anmorozov.leetcode.problems.solutions.p2483;

public class MyApproach1 implements Solution {

    @Override
    public int bestClosingTime(String customers) {
        int curPenalty = 0;
        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'Y') {
                curPenalty++;
            }
        }

        int minPenalty = curPenalty;
        int earliestHour = 0;

        for (int i = 0; i < customers.length(); i++) {
            char ch = customers.charAt(i);
            if (ch == 'Y') {
                curPenalty--;
            } else {
                curPenalty++;
            }
            if (curPenalty < minPenalty) {
                earliestHour = i + 1;
                minPenalty = curPenalty;
            }
        }

        return earliestHour;
    }
}
