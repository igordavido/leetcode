package Problem703KthLargestElementInAStream;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

class KthLargest {

    PriorityQueue<Integer> q = new PriorityQueue<Integer>();
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }
    }

    public int add(int val) {
        if (q.size() < k) {
            q.add(val);
            return q.peek();
        }
        int kThCurrent = q.peek();
        if (val >= kThCurrent) {
            q.poll();
            q.add(val);
            return q.peek();
        } else {
            return kThCurrent;
        }
    }

    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest(2, new int[] { 2, 3, 4, 5 });

        System.out.println(kthLargest.add(1));
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(9));
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
