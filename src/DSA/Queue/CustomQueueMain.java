package DSA.Queue;

public class CustomQueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(3);
        queue.insert(7);
        queue.insert(9);
        queue.insert(4);
        queue.insert(2);

        queue.display();

        System.out.println(queue.remove());

        queue.display();
    }
}
