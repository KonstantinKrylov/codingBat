package string02;

public class XyBalance {
    /**
     * We'll say that a String is xy-balanced if for all the 'x' chars in the string,
     * there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not.
     * One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
     * <p>
     * xyBalance("aaxbby") → true
     * xyBalance("aaxbb") → false
     * xyBalance("yaaxbb") → false
     */

    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));
    }

    public static boolean xyBalance(String str) {
        if (str.indexOf("x") == -1) return true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                if (str.substring(i + 1).indexOf("y") == -1) return false;
            }
        }
        return true;
    }

}
