package DSA.Recursion;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
//        subsequence("", "abcd");
        System.out.println(subsequence("", "abc"));
    }

//    static void subsequence(String p, String up){ //p : processed, up : unprocessed
//        if (up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//
//        char ch = up.charAt(0);
//
//        subsequence(p + ch, up.substring(1));
//        subsequence(p, up.substring(1));
//    }

    static ArrayList<String> subsequence(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subsequence(p + ch, up.substring(1));
        ArrayList<String> right = subsequence(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
