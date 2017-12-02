package string02;

public class PlusOut {
    /**
     * Given a string and a non-empty word string, return a version of the original String where
     * all chars have been replaced by pluses ("+"), except for appearances of the word string
     * which are preserved unchanged.
     * <p>
     * plusOut("12xy34", "xy") → "++xy++"
     * plusOut("12xy34", "1") → "1+++++"
     * plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
     */

    public static void main(String[] args) {
        System.out.println(plusOut("12xy34xyabcxy", "xy"));
    }

    public static String plusOut(String str, String word) {
        StringBuilder sb = new StringBuilder(str);
        int indx = word.length();

        for (int i = 0; i < sb.length() - indx; i++) {
            if (!sb.substring(i, i + indx).equals(word)) {
                sb.replace(i, i + 1, "+");
            } else {
                i += indx - 1;
            }
        }

        if (!sb.toString().endsWith(word)) {
            for (int i = sb.lastIndexOf(word) + indx; i < sb.length(); i++) {
                sb.replace(i, i + 1, "+");
            }
        }

        return sb.toString();
    }
}
