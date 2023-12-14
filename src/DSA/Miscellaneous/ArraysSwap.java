package DSA.Miscellaneous;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int idx1 = scanner.nextInt();
        int idx2 = scanner.nextInt();
        swap(arr, idx1, idx2);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int curr, int next) {
        int temp = arr[curr];
        arr[curr] = arr[next];
        arr[next] = temp;
    }
}
