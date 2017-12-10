package string03;

public class EqualIsNot {
    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string
     * is equal to the number of appearances of "not" anywhere in the string (case sensitive).
     * <p>
     * equalIsNot("This is not") → false
     * equalIsNot("This is notnot") → true
     * equalIsNot("noisxxnotyynotxisi") → true
     */

    public static void main(String[] args) {
        System.out.println(equalIsNot("This is notnot"));
    }

    public static boolean equalIsNot(String str) {
        String forIs = str.replaceAll("is", "=");
        String forNot = str.replaceAll("not", "-");

        int isCount = 0;
        int forCount = 0;

        for (int i = 0; i < forIs.length(); i++) {
            if (forIs.charAt(i) == '=') isCount++;
        }

        for (int i = 0; i < forNot.length(); i++) {
            if (forNot.charAt(i) == '-') forCount++;
        }

        return isCount == forCount;
    }

}
