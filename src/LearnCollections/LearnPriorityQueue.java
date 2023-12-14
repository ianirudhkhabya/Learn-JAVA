package LearnCollections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(345);
        pq.offer(572);
        pq.offer(976);
        pq.offer(231);
        pq.offer(601);
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
