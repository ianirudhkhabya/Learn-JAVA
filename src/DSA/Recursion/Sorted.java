package DSA.Recursion;

import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(isSorted(nums, 0));
    }

    static boolean isSorted(int[] arr, int idx){
        if (idx == arr.length - 1) return true;
        return arr[idx] < arr[idx + 1] && isSorted(arr, idx + 1);
    }
}
