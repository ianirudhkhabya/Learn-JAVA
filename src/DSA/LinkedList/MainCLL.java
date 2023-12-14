package DSA.LinkedList;

public class MainCLL {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(3);
        list.insert(7);
        list.insert(9);
        list.insert(2);
        list.insert(5);
        list.display();
        list.delete(2);
        list.display();
    }
}
