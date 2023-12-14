package DSA.LinkedList;

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = head;
        this.tail = tail;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int value) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (node.val == value) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node target = node.next;
            if (target.val == value) {
                node.next = target.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
