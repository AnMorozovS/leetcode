package com.anmorozov.leetcode.problems.solutions.p1971;

/**
 * Approach 4: Disjoint Set Union (DSU)
 */
public class Approach4 implements Solution {

    @Override
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        UnionFind uf = new UnionFind(n);

        for (int[] edge : edges) {
            uf.union(edge[0], edge[1]);
        }

        return uf.find(source) == uf.find(destination);
    }

    static class UnionFind {

        private final int[] root;
        private final int[] rank;

        public UnionFind(int n) {
            this.root = new int[n];
            this.rank = new int[n];
            for (int i = 0; i < n; ++i) {
                this.root[i] = i;
                this.rank[i] = 1;
            }
        }

        public int find(int index) {
            if (this.root[index] != index) {
                this.root[index] = find(this.root[index]);
            }
            return this.root[index];
        }

        public void union(int x, int y) {
            int rootFirst = find(x);
            int rootSecond = find(y);
            if (rootFirst != rootSecond) {
                if (this.rank[rootFirst] > this.rank[rootSecond]) {
                    int tmp = rootFirst;
                    rootFirst = rootSecond;
                    rootSecond = tmp;
                }
                // Modify the root of the smaller group as the root of the
                // larger group, also increment the size of the larger group.
                this.root[rootFirst] = rootSecond;
                this.rank[rootSecond] += this.rank[rootFirst];
            }
        }
    }

}
