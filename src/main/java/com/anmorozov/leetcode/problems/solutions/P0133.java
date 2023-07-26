package com.anmorozov.leetcode.problems.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class P0133 {

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        // Hash map to save the visited node and it's respective clone
        // as key and value respectively. This helps to avoid cycles.
        HashMap<Node, Node> visited = new HashMap<>();

        // Put the first node in the queue
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(node);
        // Clone the node and put it in the visited dictionary.
        visited.put(node, new Node(node.value, new ArrayList<>()));

        // Start BFS traversal
        while (!queue.isEmpty()) {
            // Pop a node say "n" from the from the front of the queue.
            Node n = queue.remove();
            // Iterate through all the neighbors of the node "n"
            for (Node neighbor : n.neighbors) {
                if (!visited.containsKey(neighbor)) {
                    // Clone the neighbor and put in the visited, if not present already
                    visited.put(neighbor, new Node(neighbor.value, new ArrayList<>()));
                    // Add the newly encountered node to the queue.
                    queue.add(neighbor);
                }
                // Add the clone of the neighbor to the neighbors of the clone node "n".
                visited.get(n).neighbors.add(visited.get(neighbor));
            }
        }

        // Return the clone of the node from visited.
        return visited.get(node);
    }

    public static class Node {

        public final int value;
        public final List<Node> neighbors;

        public Node() {
            value = 0;
            neighbors = new ArrayList<>();
        }

        public Node(int value) {
            this.value = value;
            neighbors = new ArrayList<>();
        }

        public Node(int value, ArrayList<Node> neighbors) {
            this.value = value;
            this.neighbors = neighbors;
        }

        public static Node arrayToNode(int[][] nodes) {
            Map<Integer, Node> map = new HashMap<>();
            for (int i = 0; i < nodes.length; i++) {
                Node node = new Node(i + 1, new ArrayList<>());
                map.put(i + 1, node);
            }
            for (int i = 0; i < nodes.length; i++) {
                int[] neighbors = nodes[i];
                List<Node> list = map.get(i + 1).neighbors;
                for (int neighbor : neighbors) {
                    list.add(map.get(neighbor));
                }
            }
            return map.get(1);
        }

        public static int[][] nodeToArray(Node node) {
            Set<Integer> visitedNodes = new HashSet<>();
            Queue<Node> queue = new LinkedList<>();
            queue.add(node);
            Map<Integer, int[]> map = new HashMap<>();

            while (true) {
                Node currentNode = queue.poll();
                if (currentNode == null) {
                    break;
                }
                if (visitedNodes.contains(currentNode.value)) {
                    continue;
                } else {
                    visitedNodes.add(currentNode.value);
                }
                List<Node> neighbors = currentNode.neighbors;
                int[] neighborsInt = new int[neighbors.size()];
                for (int i = 0; i < neighbors.size(); i++) {
                    Node neighbor = neighbors.get(i);
                    neighborsInt[i] = neighbor.value;
                    queue.add(neighbor);
                }
                map.put(currentNode.value, neighborsInt);
            }
            int[][] result = new int[map.size()][];
            for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
                result[entry.getKey() - 1] = entry.getValue();
            }
            return result;
        }
    }


}
