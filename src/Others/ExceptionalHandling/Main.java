package Others.ExceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

//    exception - an event that occurs during the execution of a program that,
//                disrupts the normal flow of instructions.

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter num 1: ");
            int x = scanner.nextInt();

            System.out.print("Enter num 2: ");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println("Ans: " + z);
        } catch (ArithmeticException e) {
            System.out.println("U can't divide by 0");
        } catch (InputMismatchException e) {
            System.out.println("It deserve a number");
        } catch (Exception e) {
            System.out.println("Something went wrong" + e);
        }
    }
}
