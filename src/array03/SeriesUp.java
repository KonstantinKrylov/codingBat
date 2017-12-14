package array03;

public class SeriesUp {
    /**
     * Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
     * (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n,
     * which is known to sum to exactly n*(n + 1)/2.
     * <p>
     * seriesUp(3) → [1, 1, 2, 1, 2, 3]
     * seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
     * seriesUp(2) → [1, 1, 2]
     */

    public static void main(String[] args) {
        System.out.println(seriesUp(4));
    }

    public static int[] seriesUp(int n) {
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = j + 1;
            }
        }

        int[] res = new int[n * (n + 1) / 2];
        for (int i = 0, k = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0) {
                    res[k] = arr[i][j];
                    k++;
                }
            }
        }
        return res;
    }
}
