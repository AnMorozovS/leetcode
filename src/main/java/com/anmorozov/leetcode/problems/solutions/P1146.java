package com.anmorozov.leetcode.problems.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class P1146 {

    public Integer[] useSnapshotArray(String[] commands, int[][] parametersList) {
        SnapshotArray snapshotArray = new SnapshotArray(0);
        Integer[] resultArray = new Integer[commands.length];
        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];
            int[] parameters = parametersList[i];
            switch (command) {
                case "SnapshotArray" -> {
                    snapshotArray = new SnapshotArray(parameters[0]);
                    resultArray[i] = null;
                }
                case "set" -> {
                    snapshotArray.setValue(parameters[0], parameters[1]);
                    resultArray[i] = null;
                }
                case "snap" -> resultArray[i] = snapshotArray.snap();
                case "get" -> resultArray[i] = snapshotArray.getValue(parameters[0], parameters[1]);
                default -> throw new IllegalStateException("Unexpected value: " + command);
            }
        }
        return resultArray;
    }

    static class SnapshotArray {

        private final Map<Integer, NavigableMap<Integer, Integer>> valueChangeMap;
        private int snapShotId;

        public SnapshotArray(int length) {
            snapShotId = 0;
            valueChangeMap = new HashMap<>();
            for (int i = 0; i < length; i++) {
                NavigableMap<Integer, Integer> map = new TreeMap<>();
                map.put(snapShotId, 0);
                valueChangeMap.put(i, map);
            }
        }

        public void setValue(int index, int val) {
            NavigableMap<Integer, Integer> map = valueChangeMap.get(index);
            map.put(snapShotId, val);
        }

        public int snap() {
            return snapShotId++;
        }

        public int getValue(int index, int snapId) {
            return valueChangeMap.get(index).floorEntry(snapId).getValue();
        }
    }
}
