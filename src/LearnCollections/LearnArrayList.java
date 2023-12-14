package LearnCollections;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(34);
        list.add(45);
//        System.out.println(list);

        list.add(56);
//        System.out.println(list);

        list.add(2, 67);
//        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(78);
        newList.add(89);

        list.addAll(newList);
//        System.out.println(list);

//        System.out.println(list.get(1));

//        for (int i = 0; i < list.size(); i++){
//            System.out.println("element " + i +" is " + list.get(i));
//        }

//        for(Integer ele : list){
//            System.out.println("foreach element is " + ele);
//
//        }

//        Iterator<Integer> it = list.iterator();
//        while(it.hasNext()){
//            System.out.println("iterator " + it.next());
//        }

        list.set(3, 100);
//        System.out.println(list);

//        System.out.println(list.contains(89));

        list.remove(1);
//        System.out.println(list);

        list.remove(Integer.valueOf(89));
//        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}
