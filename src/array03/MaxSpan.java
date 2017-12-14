package array03;

public class MaxSpan {
    /**
     * Consider the leftmost and righmost appearances of some value in an array.
     * We'll say that the "span" is the number of elements between the two inclusive.
     * A single value has a span of 1. Returns the largest span found in the given array.
     * (Efficiency is not a priority.)
     * <p>
     * maxSpan([1, 2, 1, 1, 3]) → 4
     * maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
     * maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
     */

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 8, 4, 1, 4};
        System.out.println(maxSpan(arr));
    }

    public static int maxSpan(int[] nums) {
        if (nums.length == 0) return 0;
        StringBuilder sb = new StringBuilder();

        for (int n : nums) {
            sb.append(String.valueOf(n));
        }

        int rightSpan = 0,
                leftSpan = 0;

        rightSpan = Math.abs(sb.length() - sb.toString().indexOf(sb.charAt(sb.length() - 1)));
        leftSpan = Math.abs(0 - sb.toString().lastIndexOf(sb.charAt(0)) - 1);

        return Math.max(rightSpan, leftSpan);
    }
}
