package recursion02;

public class SplitOdd10 {
    /**
     * Given an array of ints, is it possible to divide the ints into two groups,
     * so that the sum of one group is a multiple of 10, and the sum of the other
     * group is odd. Every int must be in one group or the other. Write a recursive
     * helper method that takes whatever arguments you like, and make the initial
     * call to your recursive helper from splitOdd10(). (No loops needed.)
     * <p>
     * splitOdd10([5, 5, 5]) → true
     * splitOdd10([5, 5, 6]) → false
     * splitOdd10([5, 5, 6, 1]) → true
     */
    public static boolean splitOdd10(int[] nums) {
        int sumLeft = 0;
        int sumRight = 0;
        int i = 0;
        return helper(sumLeft, sumRight, i, nums);
    }

    static boolean helper(int sumLeft, int sumRight, int i, int[] nums) {
        if (i >= nums.length) {
            return sumLeft % 10 == 0 && sumRight % 2 != 0;
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
        int[] arr = new int[]{5, 5, 6, 1};
        System.out.println(splitOdd10(arr));
    }
}
