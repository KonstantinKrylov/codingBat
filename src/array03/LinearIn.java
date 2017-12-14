package array03;

public class LinearIn {
    /**
     * Given two arrays of ints sorted in increasing order, outer and inner,
     * return true if all of the numbers in inner appear in outer.
     * The best solution makes only a single "linear" pass of both arrays,
     * taking advantage of the fact that both arrays are already in sorted order.
     * <p>
     * linearIn([1, 2, 4, 6], [2, 4]) → true
     * linearIn([1, 2, 4, 6], [2, 3, 4]) → false
     * linearIn([1, 2, 4, 4, 6], [2, 4]) → true
     */

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 4, 6};
        int[] b = new int[]{2, 4};
        System.out.println(linearIn(a, b));
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        if (inner.length == 0) return true;
        boolean itsOk = false;
        outer:
        for (int innerN : inner) {
            itsOk = false;
            for (int outerN : outer) {
                if (innerN == outerN) {
                    itsOk = true;
                    continue outer;
                }
            }
            if (!itsOk) return false;
        }
        return itsOk;
    }

}
