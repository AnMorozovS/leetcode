package com.anmorozov.leetcode.problems.solutions.p0743;

import java.util.*;

/**
 * Approach 3: Dijkstra's Algorithm
 */
public class Approach3 implements Solution {

    // Adjacency list
    final Map<Integer, List<Pair>> connectionsWithDelays = new HashMap<>();

    private void dijkstra(int[] signalReceivedAt, int source) {
        Queue<Pair> pq = new PriorityQueue<>
                (Comparator.comparing(Pair::key));
        pq.add(new Pair(0, source));

        // Time for starting node is 0
        signalReceivedAt[source] = 0;

        while (!pq.isEmpty()) {
            Pair topPair = pq.remove();

            int currNode = topPair.value();
            int currNodeTime = topPair.key();

            if (currNodeTime > signalReceivedAt[currNode]) {
                continue;
            }

            if (!connectionsWithDelays.containsKey(currNode)) {
                continue;
            }

            // Broadcast the signal to adjacent nodes
            for (Pair edge : connectionsWithDelays.get(currNode)) {
                int time = edge.key();
                int neighborNode = edge.value();

                // Fastest signal time for neighborNode so far
                // signalReceivedAt[currNode] + time :
                // time when signal reaches neighborNode
                if (signalReceivedAt[neighborNode] > currNodeTime + time) {
                    signalReceivedAt[neighborNode] = currNodeTime + time;
                    pq.add(new Pair(signalReceivedAt[neighborNode], neighborNode));
                }
            }
        }
    }

    @Override
    public int networkDelayTime(int[][] times, int n, int k) {
        // Build the adjacency list
        for (int[] time : times) {
            int source = time[0];
            int dest = time[1];
            int travelTime = time[2];

            connectionsWithDelays.putIfAbsent(source, new ArrayList<>());
            connectionsWithDelays.get(source).add(new Pair(travelTime, dest));
        }

        int[] signalReceivedAt = new int[n + 1];
        Arrays.fill(signalReceivedAt, Integer.MAX_VALUE);

        dijkstra(signalReceivedAt, k);

        int answer = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            answer = Math.max(answer, signalReceivedAt[i]);
        }

        // INT_MAX signifies atleat one node is unreachable
        return answer == Integer.MAX_VALUE ? -1 : answer;
    }

    record Pair(Integer key, Integer value) {
    }
}
