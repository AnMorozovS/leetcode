package com.anmorozov.leetcode.problems.solutions.p2024;

import java.util.HashMap;
import java.util.Map;

public class MyApproach1 implements Solution {

    private Map<Integer, Map<String, Map<Integer, Integer>>> cashMap;

    @Override
    public int maxConsecutiveAnswers(String answerKey, int k) {
        cashMap = new HashMap<>();
        return useCash(0, answerKey, k);
    }

    private int useCash(int fromIndex, String list, int iterationLeft) {
        Map<Integer, Integer> m = cashMap.computeIfAbsent(fromIndex, HashMap::new)
                .computeIfAbsent(list, (x) -> new HashMap<>());
        if (!m.containsKey(iterationLeft)) {
            int result = compareAnswer(fromIndex, list, iterationLeft);
            m.put(iterationLeft, result);
        }
        return m.get(iterationLeft);
    }

    private int compareAnswer(int fromIndex, String list, int iterationLeft) {
        if (iterationLeft == 0) {
            return getMaxLength(list);
        }
        int maxLength = useCash(fromIndex + 1, list, iterationLeft - 1);
        for (int i = fromIndex; i < list.length(); i++) {
            String changedString = changeAnswer(i, list);
            int tmp = useCash(i, changedString, iterationLeft - 1);
            if (maxLength < tmp) {
                maxLength = tmp;
            }
        }
        return maxLength;
    }

    private int getMaxLength(String list) {
        byte previous = 0;
        int maxCount = 0;
        int currentCount = 0;
        for (byte b : list.getBytes()) {
            if (b == previous) {
                currentCount++;
            } else {
                currentCount = 1;
                previous = b;
            }
            if (maxCount < currentCount) {
                maxCount = currentCount;
            }
        }
//        System.out.printf("%s - %d\n", list, maxCount);
        return maxCount;

    }

    private String changeAnswer(int index, String list) {
        String beginPart = list.substring(0, index);
        String middlePart = list.substring(index, index + 1);
        String endPart = "";
        if (index < list.length() - 1) {
            endPart = list.substring(index + 1);
        }
        String tConst = "T";
        String fConst = "F";
        if (middlePart.equals(tConst)) {
            return beginPart + fConst + endPart;
        } else {
            return beginPart + tConst + endPart;
        }
    }
}
