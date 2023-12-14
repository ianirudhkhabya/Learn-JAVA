package LearnCollections;

import java.util.LinkedList;
import java.util.Queue;

// Queue - FIFO
public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(87);
        q.offer(78);
        q.offer(54);
        q.offer(45);

        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
    }
}
