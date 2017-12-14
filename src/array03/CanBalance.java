package array03;

public class CanBalance {
    /**
     * Given a non-empty array, return true if there is a place to split the array
     * so that the sum of the numbers on one side is equal to the sum of the numbers
     * on the other side.
     * <p>
     * canBalance([1, 1, 1, 2, 1]) → true
     * canBalance([2, 1, 1, 2, 1]) → false
     * canBalance([10, 10]) → true
     */

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 2, 1};
        System.out.println(canBalance(arr));
    }

    public static boolean canBalance(int[] nums) {
        int leftSum = 0,
                rightSum = 0;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            for (int k = i; k < nums.length; k++) {
                rightSum += nums[k];
            }
            if (leftSum == rightSum) return true;
            leftSum = 0;
            rightSum = 0;
        }
        return false;
    }
}
