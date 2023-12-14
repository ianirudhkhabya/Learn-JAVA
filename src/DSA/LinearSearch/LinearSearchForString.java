package DSA.LinearSearch;

import java.util.Scanner;

public class LinearSearchForString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        char ch = 'u';
        System.out.println(linearSearch(name, ch));
//        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean linearSearch(String str, int target) {
        if (str.length() == 0) {
            return false;
        }

        for (int idx = 0; idx < str.length(); idx++) {
            if (str.charAt(idx) == target)
                return true;
        }
        return false;
    }
}
