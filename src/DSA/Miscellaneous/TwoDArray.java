package DSA.Miscellaneous;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] nums = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter Target: ");
        int target = scanner.nextInt();
        System.out.println(Arrays.toString(search(nums, target)));

        System.out.println(max(nums));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) return new int[]{row, col};
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] i : arr) {
            for (int j : i) {
                if (j > max) {
                    max = j;
                }
            }
        }
        return max;
    }
}
