package string02;

public class OneTwo {
    /**
     * Given a string, compute a new string by moving the first char to come after the next two chars,
     * so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd".
     * Ignore any group of fewer than 3 chars at the end.
     * <p>
     * oneTwo("abc") → "bca"
     * oneTwo("tca") → "cat"
     * oneTwo("tcagdo") → "catdog"
     */

    public static void main(String[] args) {
        System.out.println(oneTwo("abc"));
    }

    public static String oneTwo(String str) {
        if (str.length() < 3) return "";

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < str.length() - 2; i += 3) {
            sb.insert(i + 3, sb.substring(i, i + 1));
            sb.delete(i, i + 1);
        }

        int tail = sb.length() - sb.length() % 3;

        return sb.toString().substring(0, tail);
    }
}
