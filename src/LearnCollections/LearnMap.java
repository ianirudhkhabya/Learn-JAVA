package LearnCollections;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {

        Map<String, Integer> nums = new HashMap<>();

        nums.put("one", 1);
        nums.put("two", 2);
        nums.put("three", 3);
        nums.put("four", 4);
        nums.put("five", 5);

        nums.remove("three");

//        if(!nums.containsKey("two")){
//            nums.put("two", 20);
//        }
//        or
//        nums.putIfAbsent("two", 20);

//        System.out.println(nums);
//        System.out.println(nums.containsValue(4));
//
//        System.out.println(nums.isEmpty());

//        for (Map.Entry<String, Integer> e : nums.entrySet()){
//            System.out.println(e);
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }

        for (String key : nums.keySet()) {
            System.out.println(key);
        }

        for (Integer num : nums.values()) {
            System.out.println(num);
        }
    }
}
