package warmUp02;

public class StringMatch {
    /**
     * Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
     * So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings
     * appear in the same place in both strings.
     * <p>
     * stringMatch("xxcaazz", "xxbaaz") → 3
     * stringMatch("abc", "abc") → 2
     * stringMatch("abc", "axc") → 0
     */

    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
    }

    public static int stringMatch(String a, String b) {
        int pairsCount = 0;
        int endOfTheShortest = Math.min(a.length(), b.length());

        for (int i = 0; i < endOfTheShortest - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) pairsCount++;
        }
        return pairsCount;
    }

}
