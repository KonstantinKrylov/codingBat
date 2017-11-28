package warmUp02;

public class ArrayFront9 {
    /**
     * Given an array of ints, return true if one of the first 4 elements in the array is a 9.
     * The array length may be less than 4.
     * <p>
     * arrayFront9([1, 2, 9, 3, 4]) → true
     * arrayFront9([1, 2, 3, 4, 9]) → false
     * arrayFront9([1, 2, 3, 4, 5]) → false
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 3, 4};
        System.out.println(arrayFront9(arr));
    }

    public static boolean arrayFront9(int[] nums) {

        int point = nums.length;
        int count = 0;

        if (point == 0) return false;
        if (point > 4) point = 4;
        for (int i = 0; i < point; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }

}
