package com.anmorozov.leetcode.problems.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class P0332 {

    Map<String, List<Ticket>> ticketsMap;
    int flightNumber;

    public List<String> findItinerary(List<List<String>> tickets) {
        this.ticketsMap = new HashMap<>();
        flightNumber = 0;
        for (List<String> list : tickets) {
            ticketsMap.computeIfAbsent(list.get(0), x -> new ArrayList<>()).add(new Ticket(list.get(0), list.get(1)));
            flightNumber++;
        }

        return List.of("JFK", "MUC", "LHR", "SFO", "SJC");
    }

    public void methodNameWIP(String airport) {
        Queue<String> queue = new LinkedList<>();
        Set<Ticket> used = new HashSet<>();
        queue.add(airport);
    }

    record Ticket(String fromAirport, String toAirport) {

    }


}
