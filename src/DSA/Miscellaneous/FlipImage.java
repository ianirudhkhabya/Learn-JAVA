package DSA.Miscellaneous;

public class FlipImage {
    public static void main(String[] args) {

    }

    static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            for (int col = 0; col < (image[0].length) / 2; col++) {
                int temp = row[col] ^ 1;
                row[col] = row[image[0].length - col - 1] ^ 1;
                row[image[0].length - col - 1] = temp;
            }
        }
        return image;
    }
}
