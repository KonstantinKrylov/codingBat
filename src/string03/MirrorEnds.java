package string03;

public class MirrorEnds {
    /**
     * Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
     * In other words, zero or more characters at the very begining of the given string, and at the very end of the
     * string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
     * <p>
     * mirrorEnds("abXYZba") → "ab"
     * mirrorEnds("abca") → "a"
     * mirrorEnds("aba") → "aba"
     */

    public static void main(String[] args) {
        System.out.println(mirrorEnds("aba"));
    }

    public static String mirrorEnds(String string) {
        StringBuilder sb = new StringBuilder(string);
        String longest = "";

        for (int i = 1; i <= sb.length(); i++) {
            StringBuilder temp = new StringBuilder(sb.substring(0, i));
            if (sb.toString().endsWith(temp.reverse().toString())) longest = sb.substring(0, i);
        }
        return longest;
    }

}
