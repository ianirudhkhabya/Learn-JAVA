package Others.Generics;

public class Main {
    public static void main(String[] args) {

//        Printer<Integer> integerPrinter = new Printer<>(12);
//        integerPrinter.print();
//
//        Printer<Double> doublePrinter = new Printer<>(23.55);
//        doublePrinter.print();
//
//        shout("Anirudh", "Khabya");

        int add = add(2, 5);

        AnotherPrinter<Integer, String> anotherPrinter = new AnotherPrinter<>(add, "Programmer");
        anotherPrinter.print();
    }

    private static <T, V> void shout(T nameShout, V initialShout) {
        System.out.println(nameShout + " shout out to you");
        System.out.println(initialShout + " initials you got");
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
