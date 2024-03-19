package Problem506EasyRelativeRanks;

import java.util.Comparator;
import java.util.TreeMap;

public class SolutionV1 {
    public String[] findRelativeRanks(int[] score) {
        var m = new TreeMap<Integer, Integer>(Comparator.reverseOrder());
        int[] rankBySportsman = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            m.put(score[i], i);
        }
        int rank = 1;
        for (var bestIndex : m.values()) {
            rankBySportsman[bestIndex] = rank++;
        }

        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            result[i] = switch (rankBySportsman[i]) {
                case 1:
                    yield "Gold Medal";
                case 2:
                    yield "Silver Medal";
                case 3:
                    yield "Bronze Medal";
                default:
                    yield String.valueOf(rankBySportsman[i]);
            };
        }
        return result;
    }

    public static void main(String[] args) {
        int[] score = new int[]{5,4,3,2,1};
        String[] relativeRanks = new SolutionV1().findRelativeRanks(score);
    }
}
