package com.anmorozov.leetcode.problems.solutions;

import java.util.*;

public class P2101 {

    public int maximumDetonation(int[][] bombs) {
        List<Bomb> bombsList = new ArrayList<>();
        for (int i = 0; i < bombs.length; i++) {
            bombsList.add(new Bomb(bombs[i][0], bombs[i][1], bombs[i][2], i));
        }
        return maximumDetonation2(bombsList);
    }

    public int maximumDetonation2(List<Bomb> bombs) {
        Map<Bomb, Set<Bomb>> detonatedTotal = new HashMap<>();
        for (Bomb mainCycleBomb : bombs) {
            Set<Bomb> detonatedTotalByMainCycleBomb = new HashSet<>();
            for (Map.Entry<Bomb, Set<Bomb>> entry : detonatedTotal.entrySet()) {
                Bomb currentBomb = entry.getKey();
                Set<Bomb> currentSet = entry.getValue();
                if (mainCycleBomb.canDetonate(currentBomb)) {
                    detonatedTotalByMainCycleBomb.addAll(currentSet);
                }
            }
            detonatedTotalByMainCycleBomb.add(mainCycleBomb);
            for (Map.Entry<Bomb, Set<Bomb>> entry : detonatedTotal.entrySet()) {
                Bomb currentBomb = entry.getKey();
                Set<Bomb> currentSet = entry.getValue();
                if (currentBomb.canDetonate(mainCycleBomb)) {
                    currentSet.addAll(detonatedTotalByMainCycleBomb);
                    continue;
                }
                for (Bomb detonatedBomb : currentSet) {
                    if (detonatedBomb.canDetonate(mainCycleBomb)) {
                        currentSet.addAll(detonatedTotalByMainCycleBomb);
                        break;
                    }
                }
            }
            detonatedTotal.put(mainCycleBomb, detonatedTotalByMainCycleBomb);
        }

        int maxSize = 1;
        for (Map.Entry<Bomb, Set<Bomb>> entry : detonatedTotal.entrySet()) {
            if (entry.getValue().size() > maxSize) {
                maxSize = entry.getValue().size();
            }
        }
        return maxSize;
    }

    public record Bomb(int x, int y, int radius, int number) {

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Bomb bomb = (Bomb) o;

            if (x != bomb.x) {
                return false;
            }
            if (y != bomb.y) {
                return false;
            }
            if (radius != bomb.radius) {
                return false;
            }
            return number == bomb.number;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            result = 31 * result + radius;
            result = 31 * result + number;
            return result;
        }

        @Override
        public String toString() {
            return "[(" + number + ") " + x + "," + y + "," + radius + ']';
        }

        public boolean canDetonate(Bomb bomb) {
            if (this.equals(bomb)) {
                return false;
            }

            long xSqr = (long) (this.x - bomb.x) * (this.x - bomb.x);
            long ySqr = (long) (this.y - bomb.y) * (this.y - bomb.y);
            long radiusSqr = (long) this.radius * this.radius;
            return (xSqr + ySqr) <= radiusSqr;
        }
    }

}
