package DSA.LinkedList;

public class DLL {

    Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public DLL.Node find(int value) {
        DLL.Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val) {
        Node beforeNode = find(after);

        if (beforeNode == null) {
            System.out.println("Does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = beforeNode.next;
        beforeNode.next = node;
        node.prev = beforeNode;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            last = node;
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
