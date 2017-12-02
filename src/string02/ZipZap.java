package string02;

public class ZipZap {
    /**
     * Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
     * Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
     * <p>
     * zipZap("zipXzap") → "zpXzp"
     * zipZap("zopzop") → "zpzp"
     * zipZap("zzzopzop") → "zzzpzp
     */

    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));
    }

    public static String zipZap(String str) {
        if (str.length() < 1) return "";
        if (str.length() == 1) return str;

        String zzpped = "";

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'p') continue;

            zzpped += str.charAt(i);
        }

        return str.charAt(0) + zzpped + str.charAt(str.length() - 1);
    }
}
