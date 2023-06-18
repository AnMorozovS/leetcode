package com.anmorozov.leetcode.problems.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P0332 {

    Map<String, List<String>> ticketsMap;
    Map<String, Integer> freeTickets;
    int ticketsNumber;

    public List<String> findItinerary(List<List<String>> tickets) {
        this.ticketsMap = new HashMap<>();
        this.freeTickets = new HashMap<>();
        ticketsNumber = tickets.size();
        for (List<String> list : tickets) {
            ticketsMap.computeIfAbsent(list.get(0), x -> new ArrayList<>()).add(list.get(1));
            int count = freeTickets.computeIfAbsent(list.get(0) + list.get(1), x -> 0);
            freeTickets.put(list.get(0) + list.get(1), count + 1);
        }
        for (Map.Entry<String, List<String>> entry : ticketsMap.entrySet()) {
            entry.getValue().sort(String::compareTo);
        }
        List<String> startPosition = new ArrayList<>();
        startPosition.add("JFK");
        ticketsMap.put("1", startPosition);
        freeTickets.put("1JFK", 1);
        List<String> reverseList = methodNameWIP("JFK", "1");
        int j = 0;
        List<String> result = new ArrayList<>();
        for (int i = reverseList.size() - 1; i >= 0; i--, j++) {
            result.add(j, reverseList.get(i));
        }
        return result;
    }

    public List<String> methodNameWIP(String airport, String from) {
        int oldNumb = freeTickets.get(from + airport);
        if (oldNumb == 1) {
            freeTickets.remove(from + airport);
        } else {
            freeTickets.put(from + airport, oldNumb - 1);
        }
        if (freeTickets.size() == 0) {
            List<String> result = new ArrayList<>();
            result.add(airport);
            return result;
        }

        for (String currentDirection : ticketsMap.getOrDefault(airport, new ArrayList<>())) {
            if (freeTickets.containsKey(airport + currentDirection)) {
                List<String> result = methodNameWIP(currentDirection, airport);
                if (result != null) {
                    result.add(airport);
                    return result;
                }
            }
        }
        freeTickets.put(from + airport, oldNumb);

        return null;
    }


}
