package string02;

public class XyzThere {
    /**
     * Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
     * <p>
     * xyzThere("abcxyz") → true
     * xyzThere("abc.xyz") → false
     * xyzThere("xyz.abc") → true
     */

    public static void main(String[] args) {
        System.out.println(xyzThere("abc.xyz"));
    }

    public static boolean xyzThere(String str) {
        if (str.startsWith("xyz")) return true;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz") && str.charAt(i - 1) != '.') {
                return true;
            }
        }

        return false;
    }
}
