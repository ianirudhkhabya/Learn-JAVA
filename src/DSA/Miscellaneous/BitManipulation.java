package DSA.Miscellaneous;

public class BitManipulation {
    public static void main(String[] args) {
//        System.out.println(magicNo());
//        System.out.println(noOfDigits());
//        System.out.println(powerOfTwo());
//        System.out.println(calculatePower());
//        System.out.println(setBits());
        int a = 3, b = 9;
        int ans = rangeXOR(b) ^ rangeXOR(a - 1);
        System.out.println(ans);
    }

    static int magicNo() {
        int n = 3;
        int ans = 0;
        int base = 5;

        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base *= 5;
        }
        return ans;
    }

    // find no of digits in base b
    static int noOfDigits() {
        int n = 100;
        int b = 2;

        return (int) (Math.log(n) / Math.log(b)) + 1;
    }

    static boolean powerOfTwo() {
        int n = 1;
        if (n == 0 || n == 1) {
            return false;
        }

        return (n & (n - 1)) == 0;
    }

    static int calculatePower() {
        int base = 3;
        int power = 6;
        int ans = 1;

        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= base;
            }

            base *= base;
            power = power >> 1;
        }
        return ans;
    }

    static int setBits() {
        int n = 10;
        int count = 0;

        while (n > 0) {
            count++;
            n -= (n & (-n));
        }
        return count;
    }

    static int rangeXOR(int z) {
        if (z % 4 == 0) {
            return z;
        }

        if (z % 4 == 1) {
            return 1;
        }

        if (z % 4 == 2) {
            return z + 1;
        }
        return 0;
    }
}
