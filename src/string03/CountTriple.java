package string03;

public class CountTriple {
    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * <p>
     * countTriple("abcXXXabc") → 1
     * countTriple("xxxabyyyycd") → 3
     * countTriple("a") → 0
     */

    public static void main(String[] args) {
        System.out.println(countTriple("abcXXXabc"));
    }

    public static int countTriple(String str) {
        int count = 1;
        int tCount = 0;
        String pattern = "";

        for (int i = 0; i < str.length() - 1; i++) {

            pattern = str.substring(i, i + 1);

            for (int j = i; j < str.length() - 1; j++) {
                if (pattern.equals(str.substring(j + 1, j + 2))) {
                    count++;
                    if (count == 3) tCount++;
                } else {
                    break;
                }
            }
            count = 1;
        }
        return tCount;
    }


}
