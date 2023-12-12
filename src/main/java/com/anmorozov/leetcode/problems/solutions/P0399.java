package com.anmorozov.leetcode.problems.solutions;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P0399 {

    private final Map<String, Pair> gidWeight = new HashMap<>();

    private Pair find(String nodeId) {
        if (!gidWeight.containsKey(nodeId)) {
            gidWeight.put(nodeId, new Pair(nodeId, 1.0));
        }

        Pair entry = gidWeight.get(nodeId);
        if (!entry.key().equals(nodeId)) {
            Pair newEntry = find(entry.key());
            gidWeight.put(nodeId, new Pair(
                    newEntry.key(), entry.value() * newEntry.value()));
        }

        return gidWeight.get(nodeId);
    }

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

    private void union(String dividend, String divisor, Double value) {
        Pair dividendEntry = find(dividend);
        Pair divisorEntry = find(divisor);

        String dividendGid = dividendEntry.key();
        String divisorGid = divisorEntry.key();
        Double dividendWeight = dividendEntry.value();
        Double divisorWeight = divisorEntry.value();

        if (!dividendGid.equals(divisorGid)) {
            gidWeight.put(dividendGid, new Pair(divisorGid, divisorWeight * value / dividendWeight));
        }
    }

    private double getCost(String dividend, String divisor) {
        if (!gidWeight.containsKey(dividend) || !gidWeight.containsKey(divisor)) {
            return -1.0;
        } else {
            Pair dividendEntry = find(dividend);
            Pair divisorEntry = find(divisor);

            String dividendGid = dividendEntry.key();
            String divisorGid = divisorEntry.key();
            Double dividendWeight = dividendEntry.value();
            Double divisorWeight = divisorEntry.value();

            if (!dividendGid.equals(divisorGid)) {
                return -1.0;
            } else {
                return dividendWeight / divisorWeight;
            }
        }
    }

    record Pair(String key, Double value) {
    }

}
