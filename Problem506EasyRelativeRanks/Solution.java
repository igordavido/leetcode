package Problem506EasyRelativeRanks;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparing(i -> -score[i]));

        for (int i = 0; i < score.length; i++) {
            queue.add(i);
        }

        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            int rank = queue.poll();
            result[rank] = switch (i) {
                case 0:
                    yield "Gold Medal";
                case 1:
                    yield "Silver Medal";
                case 2:
                    yield "Bronze Medal";
                default:
                    yield String.valueOf(rank + 1);
            };
        }
        return result;
    }

    public static void main(String[] args) {
        int[] score = new int[]{10,3,8,9,4};
        String[] relativeRanks = new Solution().findRelativeRanks(score);
    }
}
