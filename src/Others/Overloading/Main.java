package Others.Overloading;

public class Main {
    // overloaded methods -> methods that share same name but have different parameters
    //                       method name + parameters = method signature

    public static void main(String[] args) {

        int x = add(2.35, 3.55, 5.25);
        System.out.println(x);
    }

    static int add(int a, int b) {
        System.out.println("Overloading method #1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("Overloading method #2");
        return a + b + c;
    }

    static double add(double a, double b) {
        System.out.println("Overloading method #3");
        return a + b;
    }

    static int add(double a, double b, double c) {
        System.out.println("Overloading method #5");
        return (int) ((int) a + b + c);
    }
}
