package DSA.BinarySearch;

import java.util.Scanner;

public class RBS {
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

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) return binarySearch(nums, target, 0, nums.length - 1);
        if (target == nums[pivot]) return pivot;
        if (target >= nums[0]) return binarySearch(nums, target, 0, pivot - 1);
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) return mid; //case 1
            if (mid > start && arr[mid] < arr[mid - 1]) return mid - 1; //case 2
            if (arr[mid] <= arr[start]) end = mid - 1; //case 3
            else start = mid + 1; //case 4
        }
        return -1;
    }

    static int findPivotWithoutDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) return mid; //case 1
            if (mid > start && arr[mid] < arr[mid - 1]) return mid - 1; //case 2
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) return start;
                start++;
                if (arr[end] < arr[end - 1]) return end - 1;
                end--;
            } else if (arr[start] < arr[mid] || arr[mid] == arr[start] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
