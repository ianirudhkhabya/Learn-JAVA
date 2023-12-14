package LearnCollections;

import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {

//        int[] nums = {1,2,3,4,5,6,7,8,9,10};
//        int idx = Arrays.binarySearch(nums, 4);
//        System.out.println("Element: " + idx);

        Integer[] numbers = {12, 23, 54, 43, 98, 67, 7, 2, 9, 81};
//        Arrays.sort(numbers);
//        Arrays.parallelSort(numbers); // (parallel sort works when there are at least 8192 entries)

        Arrays.fill(numbers, 36);

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
