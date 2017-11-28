package warmUp02;

public class ArrayCount9 {
    /**
     * Given an array of ints, return the number of 9's in the array.
     * <p>
     * arrayCount9([1, 2, 9]) → 1
     * arrayCount9([1, 9, 9]) → 2
     * arrayCount9([1, 9, 9, 3, 9]) → 3
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 9};
        System.out.println(arrayCount9(arr));
    }

    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int item : nums) {
            if (item == 9) count++;
        }
        return count;
    }

}
