package DSA.Miscellaneous;

import java.util.Scanner;

public class InfiniteArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter target: ");
        int target = scanner.nextInt();
        System.out.println(findRange(nums, target));
    }

    static int findRange(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int nextStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = nextStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
