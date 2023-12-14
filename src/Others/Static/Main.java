package Others.Static;

public class Main {
    // static -> keyword that means they don't depend on objects,
    //           So basically with the help of static keyword, u can make the properties of class which means u don't need to make an object
    //           A single copy of a variable/method is created and shared.
    //           The class "owns" the static member.

    public static void main(String[] args) {
        Friend friend = new Friend("Ani");
        Friend friend1 = new Friend("Bob");
        Friend friend2 = new Friend("Luv");
        Friend friend3 = new Friend("Aby");
        friend3.displayFriends();
    }
}
