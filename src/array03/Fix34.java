package array03;

public class Fix34 {
    /**
     * Return an array that contains exactly the same numbers as the given array,
     * but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's,
     * but every other number may move. The array contains the same number of 3's and 4's,
     * every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
     * <p>
     * fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
     * fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
     * fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
     */

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 1, 4, 4, 3, 1};
        fix34(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }

    public static int[] fix34(int[] nums) {
        int pos4 = 0,
                pos4repl = 0,
                temp = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] != 4) {
                pos4repl = i + 1;

                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 4 && nums[j - 1] != 3) {
                        pos4 = j;
                        break;
                    }
                }

                temp = nums[pos4];
                nums[pos4] = nums[pos4repl];
                nums[pos4repl] = temp;
            }
        }
        return nums;
    }
}
