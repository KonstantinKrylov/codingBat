package recursion02;

public class Split53 {
    /**
     * Given an array of ints, is it possible to divide the ints into two groups,
     * so that the sum of the two groups is the same, with these constraints: all
     * the values that are multiple of 5 must be in one group, and all the values
     * that are a multiple of 3 (and not a multiple of 5) must be in the other.
     * (No loops needed.)
     * <p>
     * split53([1, 1]) → true
     * split53([1, 1, 1]) → false
     * split53([2, 4, 2]) → true
     */
    public static boolean split53(int[] nums) {
        int sumLeft = 0;
        int sumRight = 0;
        int i = 0;
        return helper(sumLeft, sumRight, i, nums);
    }

    static boolean helper(int sumLeft, int sumRight, int i, int[] nums) {
        if (i >= nums.length) {
            return sumLeft == sumRight;
        }

        if (leftSumCheck(nums[i]) && helper(sumLeft + nums[i], sumRight, i + 1, nums)) {
            return true;
        }

        if (rightSumCheck(nums[i]) && helper(sumLeft, sumRight + nums[i], i + 1, nums)) {
            return true;
        }

        return false;
    }

    static boolean leftSumCheck(int n) {
        if (n % 5 != 0 && n != 3) return true;
        if (n % 5 == 0 && n % 3 != 0) return true;
        return false;
    }

    static boolean rightSumCheck(int n) {
        if (n % 3 != 0 && n % 5 != 0) return true;
        if (n % 3 == 0 && n % 5 != 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 2};
        System.out.println(split53(arr));
    }

}
