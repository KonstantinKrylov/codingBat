package warmUp02;

public class StringYak {
    /**
     * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
     * but the "a" can be any char. The "yak" strings will not overlap.
     * <p>
     * stringYak("yakpak") → "pak"
     * stringYak("pakyak") → "pak"
     * stringYak("yak123ya") → "123ya"
     */

    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));
    }

    public static String stringYak(String str) {
        String yakFreeStr = "";

        for (int i = 0; i < str.length(); i++) {

            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i = i + 2;
            } else {
                yakFreeStr = yakFreeStr + str.charAt(i);
            }
        }

        return yakFreeStr;
    }

}