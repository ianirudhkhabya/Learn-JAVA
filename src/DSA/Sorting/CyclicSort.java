package DSA.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
//    Cyclic sort is a comparison sorting algorithm that forces an array to be factored into a number of cycles where each of them can be rotated to produce a sorted array.
//    It is theoretically optimal in the sense that it reduces the number of writes to the original array1.
//    It is an in-place and unstable sorting algorithm12.
//
//    Here’s a brief explanation of the algorithm:
//
//    1 -> Start with an unsorted array of n elements.
//    2 -> Initialize a variable, cycleStart, to 0.
//    3 -> For each element in the array, compare it with every other element to its right. If there are any elements that are smaller than the current element, increment cycleStart.
//    4 -> Once a smaller element is found, swap the current element with the first element in its cycle. The cycle is then continued until the current element returns to its original position.
//    5 -> Repeat steps 3-4 until all cycles have been completed. The array is now sorted

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else
                i++;
        }
    }

    static void swap(int[] arr, int curr, int next) {
        int temp = arr[curr];
        arr[curr] = arr[next];
        arr[next] = temp;
    }
}
