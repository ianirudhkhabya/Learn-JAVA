package DSA.Recursion;

public class SkipInString {
    public static void main(String[] args) {
        System.out.println(skip("baccadhare"));
    }

//    static void skip(String processed, String unprocessed){
//        if (unprocessed.isEmpty()){
//            System.out.println(processed);
//            return;
//        }
//
//        char ch = unprocessed.charAt(0);
//
//        if (ch == 'a'){
//            skip(processed, unprocessed.substring(1));
//        }else {
//            skip(processed + ch, unprocessed.substring(1));
//        }
//    }

    static String skip(String unprocessed) {
        if (unprocessed.isEmpty()) {
            return "";
        }

        char ch = unprocessed.charAt(0);

        if (ch == 'a') {
            return skip(unprocessed.substring(1));
        } else {
            return ch + skip(unprocessed.substring(1));
        }
    }
}
