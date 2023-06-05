package com.anmorozov.leetcode.problems.solutions;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.util.Pair;

public class P0399 {

    private final Map<String, Pair<String, Double>> gidWeight = new HashMap<>();

    public double[] calcEquation(List<List<String>> equations, double[] values,
                                 List<List<String>> queries) {

        for (int i = 0; i < equations.size(); i++) {
            union(equations.get(i).get(0), equations.get(i).get(1), values[i]);
        }
        double[] results = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            results[i] = BigDecimal.valueOf(getCost(queries.get(i).get(0), queries.get(i).get(1)))
                    .setScale(5, RoundingMode.HALF_UP).doubleValue();
        }

        return results;
    }

    private Pair<String, Double> find(String nodeId) {
        if (!gidWeight.containsKey(nodeId)) {
            gidWeight.put(nodeId, new Pair<>(nodeId, 1.0));
        }

        Pair<String, Double> entry = gidWeight.get(nodeId);
        if (!entry.getKey().equals(nodeId)) {
            Pair<String, Double> newEntry = find(entry.getKey());
            gidWeight.put(nodeId, new Pair<>(
                    newEntry.getKey(), entry.getValue() * newEntry.getValue()));
        }

        return gidWeight.get(nodeId);
    }

    private void union(String dividend, String divisor, Double value) {
        Pair<String, Double> dividendEntry = find(dividend);
        Pair<String, Double> divisorEntry = find(divisor);

        String dividendGid = dividendEntry.getKey();
        String divisorGid = divisorEntry.getKey();
        Double dividendWeight = dividendEntry.getValue();
        Double divisorWeight = divisorEntry.getValue();

        if (!dividendGid.equals(divisorGid)) {
            gidWeight.put(dividendGid, new Pair<>(divisorGid, divisorWeight * value / dividendWeight));
        }
    }

    private double getCost(String dividend, String divisor) {
        if (!gidWeight.containsKey(dividend) || !gidWeight.containsKey(divisor)) {
            return -1.0;
        } else {
            Pair<String, Double> dividendEntry = find(dividend);
            Pair<String, Double> divisorEntry = find(divisor);

            String dividendGid = dividendEntry.getKey();
            String divisorGid = divisorEntry.getKey();
            Double dividendWeight = dividendEntry.getValue();
            Double divisorWeight = divisorEntry.getValue();

            if (!dividendGid.equals(divisorGid)) {
                return -1.0;
            } else {
                return dividendWeight / divisorWeight;
            }
        }
    }

}
