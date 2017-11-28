package warmUp02;

public class StringSplosion {
    /**
     * Given a non-empty string like "Code" return a string like "CCoCodCode".
     * <p>
     * stringSplosion("Code") → "CCoCodCode"
     * stringSplosion("abc") → "aababc"
     * stringSplosion("ab") → "aab"
     */

    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
    }

    public static String stringSplosion(String str) {
        String resultStr = "";
        for (int i = 0; i < str.length(); i++) {
            resultStr += str.substring(0, i + 1);
        }
        return resultStr;
    }

}
