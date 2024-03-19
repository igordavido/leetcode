package Problem2558TakeGiftsFromtheRichestPile;

import java.util.PriorityQueue;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        var pq = new PriorityQueue<Integer>();
        for (int i = 0; i < gifts.length; i++) {
            pq.add(gifts[i]);
        }


        for (int i = 0; i < k; i++) {
            int largest = pq.poll();
            int sqRoot = (int)Math.floor(Math.pow(largest, 0.5f));
            pq.add(sqRoot);
        }

        int remaining = 0;
        while (!pq.isEmpty()) {
            remaining += pq.poll();
        }
        return remaining;
    }

    public static void main(String[] args) {
        new Solution().pickGifts(new int[]{25,64,9,4,100}, 4);
    }
}
