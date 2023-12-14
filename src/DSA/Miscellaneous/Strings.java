package DSA.Miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("ALL")
public class Strings {
    public static void main(String[] args) {
//        comparison();
//        operators();
//        prettyPrinting();
//        series();
//        stringBuilder();
//        methods();
        System.out.println(isPalindrome());
    }

    static void comparison() {
        String a = "Anirudh";
        String b = "Anirudh";
        System.out.println(a == b);

        String c = a;
        System.out.println(c == a);

        String name1 = new String("Anirudh");
        String name2 = new String("Anirudh");
        System.out.println(name1 == name2);
    }

    static void operators() {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println("a" + 1);
        System.out.println("Anirudh" + new ArrayList<>());
        System.out.println("Anirudh" + new Integer(07));
        System.out.println(new Integer(07) + "" + new ArrayList<>());
        System.out.println("a" + 'v');
    }

    static void prettyPrinting() {
        float num = 43.12789f;
        System.out.printf("Formatted num is %.2f", num);
        System.out.println();
        System.out.printf("My name is %s and I am %s", "Anirudh", "coder");
    }

    static void series() {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch;
        }
        System.out.println(series);
    }

    static void stringBuilder() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
    }

    static void methods() {
        String name = "Anirudh Khabya";
        System.out.println(name.toLowerCase());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.indexOf("u"));
        System.out.println(Arrays.toString(name.split(" ")));
    }

    static boolean isPalindrome() {
        String str = "abcdcba";
        if (str == null || str.length() == 0) return true;
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) return false;
        }
        return true;
    }
}
