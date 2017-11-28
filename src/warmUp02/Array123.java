package warmUp02;

public class Array123 {
    /**
     * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
     * <p>
     * array123([1, 1, 2, 3, 1]) → true
     * array123([1, 1, 2, 4, 1]) → false
     * array123([1, 1, 2, 1, 2, 3]) → true
     */

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 1};
        System.out.println(array123(arr));
    }

    public static boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) return true;
        }
        return false;
    }

}
