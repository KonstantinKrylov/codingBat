package string02;

public class GetSandwich {
    /**
     * A sandwich is two pieces of bread with something in between. Return the string that is between
     * the first and last appearance of "bread" in the given string, or return the empty string ""
     * if there are not two pieces of bread.
     * <p>
     * <p>
     * getSandwich("breadjambread") → "jam"
     * getSandwich("xxbreadjambreadyy") → "jam"
     * getSandwich("xxbreadyy") → ""
     */

    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));
    }

    public static String getSandwich(String str) {
        if (str.length() < 5 || str.indexOf("bread") == -1) return "";

        int firstOcc = str.indexOf("bread");
        int lastOcc = str.lastIndexOf("bread");

        if (firstOcc == lastOcc) return "";

        return str.substring(firstOcc + 5, lastOcc);
    }
}
