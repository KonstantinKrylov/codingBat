package string02;

public class DoubleChar {
    /**
     * Given a string, return a string where for every char in the original, there are two chars.
     * <p>
     * doubleChar("The") → "TThhee"
     * doubleChar("AAbb") → "AAAAbbbb"
     * doubleChar("Hi-There") → "HHii--TThheerree"
     */

    public static void main(String[] args) {
        System.out.println(doubleChar("The"));
    }

    public static String doubleChar(String str) {
        String doubledStr = "";
        for (int i = 0; i < str.length(); i++) {
            doubledStr += "" + str.charAt(i) + str.charAt(i);
        }
        return doubledStr;
    }
}
