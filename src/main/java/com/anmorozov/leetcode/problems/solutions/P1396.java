package com.anmorozov.leetcode.problems.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;

public class P1396 {


    Map<String, List<Double>> averageTimeStorage;
    Map<Integer, StationTime> checkInStorage;

    public P1396() {
        this.averageTimeStorage = new HashMap<>();
        this.checkInStorage = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        Map<String, Integer> stationTime = new HashMap<>();
        stationTime.put(stationName, t);
        checkInStorage.put(id, new StationTime(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        StationTime stationTime = checkInStorage.get(id);
        String stationNameIn = stationTime.stationName();
        int timeIn = stationTime.t();
        double timePassed = (double) timeIn - t;
        String stationKey = getStationsKey(stationNameIn, stationName);
        if (!averageTimeStorage.containsKey(stationKey)) {
            List<Double> list = new ArrayList<>();
            list.add(timePassed);
            averageTimeStorage.put(stationKey, list);
        } else {
            List<Double> list = averageTimeStorage.get(stationKey);
            list.add(timePassed);
        }
        checkInStorage.remove(id);
    }

    private String getStationsKey(String startStation, String endStation) {
        return startStation + "-" + endStation;
    }

    public double getAverageTime(String startStation, String endStation) {
        String stationKey = getStationsKey(startStation, endStation);
        List<Double> list = averageTimeStorage.get(stationKey);
        OptionalDouble average = list.stream().mapToDouble(a -> a).average();
        return average.orElse(0d);
    }

    record StationTime(String stationName, int t) {

    }

}
