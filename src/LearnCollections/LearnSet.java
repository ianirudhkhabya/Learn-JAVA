package LearnCollections;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {

        Set<StudentSet> ss = new HashSet<>();

        ss.add(new StudentSet("Aayush", 1));
        ss.add(new StudentSet("Rishabh", 4));
        ss.add(new StudentSet("Pratham", 3));
        ss.add(new StudentSet("Abhishek", 1));

        StudentSet s1 = new StudentSet("Anirudh", 2);
        StudentSet s2 = new StudentSet("Khabya", 2);
        System.out.println(s1.equals(s2));
        System.out.println(ss);

//        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();
//        Set<Integer> set = new TreeSet<>();
//
//        set.add(32);
//        set.add(90);
//        set.add(66);
//        set.add(48);
//        set.add(17);
//
//        System.out.println(set);
//
//        set.remove(66);
//        System.out.println(set);
//
//        System.out.println(set.contains(90));
//        System.out.println(set.isEmpty());
//        System.out.println(set.size());
//
//        set.clear();
//        System.out.println(set);
    }
}
