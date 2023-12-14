package DSA.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
//    Insertion sort is a simple sorting algorithm that works similarly to how we sort playing cards in our hands.
//    The algorithm iterates over the array and at each iteration, it removes one element from the array,
//    finds the location it belongs to in the sorted list and inserts it there, shifting the larger values as it goes.
//    This code reads an array of integers from the user, sorts it using the insertion sort algorithm, and then prints the sorted array.
//    The time complexity of this algorithm is O(N^2), and it uses O(1) auxiliary space.

//    Step 1: Iterate from arr[1] to arr[n] over the array.
//    Step 2: Compare the current element (key) to its predecessor.
//    Step 3: If the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one position up to make space for the swapped element.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0...i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
