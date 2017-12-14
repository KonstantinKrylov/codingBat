package array03;

public class SquareUp {
    /**
     * Given n>=0, create an array length n*n with the following pattern,
     * shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
     * <p>
     * squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
     * squareUp(2) → [0, 1, 2, 1]
     * squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
     */

    public static void main(String[] args) {
        System.out.println(squareUp(4));
    }

    public static int[] squareUp(int n) {
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= arr.length - i - 1; j--) {
                arr[i][j] = arr.length - j;
            }
        }

        int[] res = new int[n * n];

        for (int i = 0, k = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++, k++) {
                res[k] = arr[i][j];
            }
        }
        return res;
    }
}
