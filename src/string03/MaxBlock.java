package string03;

public class MaxBlock {
    /**
     * Given a string, return the length of the largest "block" in the string.
     * A block is a run of adjacent chars that are the same.
     * <p>
     * maxBlock("hoopla") → 2
     * maxBlock("abbCCCddBBBxx") → 3
     * maxBlock("") → 0
     */

    public static void main(String[] args) {
        System.out.println(maxBlock("abbCCCddBBBxx"));
    }

    public static int maxBlock(String str) {
        if (str.length() == 0) return 0;
        int count = 1;
        int countMax = 0;
        char pattern = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == pattern) {
                count++;
                pattern = str.charAt(i);
            } else {
                pattern = str.charAt(i);
                if (count > countMax) countMax = count;
                count = 1;
            }
        }
        if (count > countMax) countMax = count;
        return countMax;
    }

}
