package array03;

public class MaxMirror {
    /**
     * We'll say that a "mirror" section in an array is a group of contiguous elements
     * such that somewhere in the array, the same group appears in reverse order.
     * For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3
     * (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.
     * <p>
     * maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
     * maxMirror([1, 2, 1, 4]) → 3
     * maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
     */

    public static void main(String[] args) {
        int[] arr = new int[]{5, 9, 1, 6, 5, 4, 1, 9, 5};
        System.out.println(maxMirror(arr));
    }

    public static int maxMirror(int[] nums) {

        int[] arr = new int[nums.length];
        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            arr[i] = nums[j];
        }

        int count = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            outer:
            for (int j = 0; j < nums.length; j++) {
                if (arr[i] == nums[j]) {
                    for (int arrK = i, numsK = j; arrK < arr.length && numsK < nums.length; arrK++, numsK++) {
                        if (arr[arrK] == nums[numsK]) {
                            count++;
                        } else {
                            max = Math.max(max, count);
                            count = 0;
                            continue outer;
                        }
                    }
                }
                max = Math.max(max, count);
                count = 0;
            }
        }
        return max;
    }
}
