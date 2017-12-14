package array03;

public class CountClumps {
    /**
     * Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
     * Return the number of clumps in the given array.
     * <p>
     * countClumps([1, 2, 2, 3, 4, 4]) → 2
     * countClumps([1, 1, 2, 1, 1]) → 2
     * countClumps([1, 1, 1, 1, 1]) → 1
     */

    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2};
        System.out.println(countClumps(arr));
    }

    public static int countClumps(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
                for (int j = i + 1; j < nums.length - 1; j++) {
                    if (nums[j] != nums[j + 1]) {
                        i = j;
                        break;
                    }
                    i = j;
                }
            }
        }
        return count;
    }
}
