package DSA.LinearSearch;

import java.util.Scanner;

public class MinInLinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(min(nums));
    }

    static int min(int[] arr) {
        if (arr.length == 0) return -1;

        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < min) min = j;
        }
        return min;
    }
}
