package Others.Static;

public class Friend {

    String name;
    static int noOfFriends = 0;

    Friend(String name) {
        this.name = name;
        noOfFriends++;
    }

    void displayFriends() {
        System.out.println("U have " + noOfFriends + " friends.");
    }
}
