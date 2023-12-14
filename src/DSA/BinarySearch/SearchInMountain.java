package DSA.BinarySearch;

import java.util.Scanner;

public class SearchInMountain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter target: ");
        int target = scanner.nextInt();
        System.out.println(search(nums, target));
    }

    static int search(int[] arr, int target) {
        int peak = peakIndex(arr);
        int firstHalf = orderAgnosticBS(arr, target, 0, peak);
        if (firstHalf != -1) return firstHalf;
        //otherwise search in second half
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) end = mid;
            else start = mid + 1;
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) return mid;

            if (isAsc) {
                if (target < arr[mid]) end = mid - 1;
                else start = mid + 1;
            } else {
                if (target < arr[mid]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}
