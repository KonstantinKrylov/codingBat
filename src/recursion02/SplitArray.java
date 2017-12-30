package recursion02;

public class SplitArray {
    /**
     * Given an array of ints, is it possible to divide the ints into two groups,
     * so that the sums of the two groups are the same. Every int must be in one
     * group or the other. Write a recursive helper method that takes whatever
     * arguments you like, and make the initial call to your recursive helper from
     * splitArray(). (No loops needed.)
     * <p>
     * splitArray([2, 2]) → true
     * splitArray([2, 3]) → false
     * splitArray([5, 2, 3]) → true
     */
    public static boolean splitArray(int[] nums) {
        int sumLeft = 0;
        int sumRight = 0;
        int i = 0;
        return helper(sumLeft, sumRight, i, nums);
    }

    static boolean helper(int sumLeft, int sumRight, int i, int[] nums) {
        if (i >= nums.length) {
            return sumLeft == sumRight;
        }

        if (helper(sumLeft + nums[i], sumRight, i + 1, nums)) {
            return true;
        }
        if (helper(sumLeft, sumRight + nums[i], i + 1, nums)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 3};
        System.out.println(splitArray(arr));
    }
}
