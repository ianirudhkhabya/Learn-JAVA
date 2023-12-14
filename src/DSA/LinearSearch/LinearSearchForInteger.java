package DSA.LinearSearch;

import java.util.Scanner;

public class LinearSearchForInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter target: ");
        int target = scanner.nextInt();

        System.out.println(linearSearch(nums, target));
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int idx = 0; idx < arr.length; idx++) {
            int element = arr[idx];
            if (element == target) {
                return idx;
            }
        }
        return -1;
    }
}
