package DSA.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queueing {
    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(3);
//        queue.add(7);
//        queue.add(45);
//        queue.add(69);
//        queue.add(12);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>(); //faster than queue
        deque.add(69);
        deque.addLast(7);
        deque.removeFirst();
    }
}
