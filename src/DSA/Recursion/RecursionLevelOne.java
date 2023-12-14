package DSA.Recursion;

public class RecursionLevelOne {
    static int sum = 0;

    public static void main(String[] args) {
        System.out.println(countAnyNum(344622447));
    }

    static void func(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        func(n - 1);
    }

    static void funcRev(int n) {
        if (n == 0) {
            return;
        }

        funcRev(n - 1);
        System.out.println(n);
    }

    static void funcBoth(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        funcBoth(n - 1);
        System.out.println(n);
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }

    static int sumOfDigits(int n) {
        if (n == 0) return 0;

        int rem = n % 10;
        return rem + sumOfDigits(n / 10);
    }

    static int product(int n) {
        if (n % 10 == n) return n;
        return (n % 10) * product(n / 10);
    }

    static void reverseNumMethodOne(int n) {
        if (n == 0) return;
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverseNumMethodOne(n / 10);
    }

    static int countAnyNum(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int c) {
        if (n == 0) return c;

        int rem = n % 10;
        if (rem == 0) return helper(n / 10, c + 1);
        return helper(n / 10, c);
    }
}
