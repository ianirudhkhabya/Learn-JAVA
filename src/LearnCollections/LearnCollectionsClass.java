package LearnCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {
    public static void main(String[] args) {

        List<StudentSet> list = new ArrayList<>();

        list.add(new StudentSet("Aayush", 1));
        list.add(new StudentSet("Rishabh", 4));
        list.add(new StudentSet("Pratham", 3));
        list.add(new StudentSet("Abhishek", 2));

        StudentSet s1 = new StudentSet("Anirudh", 3);
        StudentSet s2 = new StudentSet("Khabya", 2);
//        System.out.println(s1.compareTo(s2));

        System.out.println(list);

        Collections.sort(list, new Comparator<StudentSet>() {
            @Override
            public int compare(StudentSet o1, StudentSet o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        System.out.println(list);

        System.out.println("Min rollNo: " + Collections.min(list, new Comparator<StudentSet>() {
            @Override
            public int compare(StudentSet o1, StudentSet o2) {
                return Integer.compare(o1.rollNo, o2.rollNo);
            }
        }));

        System.out.println("Max rollNo: " + Collections.max(list, new Comparator<StudentSet>() {
            @Override
            public int compare(StudentSet o1, StudentSet o2) {
                return Integer.compare(o1.rollNo, o2.rollNo);
            }
        }));

    }
}
