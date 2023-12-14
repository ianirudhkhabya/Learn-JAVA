package DSA.Miscellaneous;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fruit name: ");
        String fruit = scanner.next();
        String str = fruit.toLowerCase();

        switch (str) {
            case "mango":
                System.out.println("King of the fruits");
                break;
            case "apple":
                System.out.println("Keeps doctor away");
                break;
            case "banana":
                System.out.println("Big yellow fruit");
                break;
            case "grapes":
                System.out.println("A small fruit");
                break;
            default:
                System.out.println("Please enter valid fruit");
        }
    }
}
