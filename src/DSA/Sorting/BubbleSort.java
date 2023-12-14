package DSA.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
//    Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted. Here’s a brief explanation of how it works:
//
//    1 -> Start with the first element in the array.
//    2 -> Compare the current element with the next one.
//    3 -> If the current element is greater than the next, swap them.
//    4 -> Move to the next element and repeat the process.
//    5 -> This continues until the end of the array. At this point, the largest element has bubbled to the end of the array.
//    6 -> Repeat the process starting from the first element again, but now until the second last element.
//    7 -> Continue this process until no more swaps are needed.

//    In terms of complexity, the time complexity of Bubble Sort is O(n^2) in the worst case, when the array is reverse sorted.
//    The best case time complexity is O(n) when the array is already sorted. The space complexity is O(1) as no extra space is required

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
