package warmUp02;

public class StringX {
    /**
     * Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
     * <p>
     * stringX("xxHxix") → "xHix"
     * stringX("abxxxcd") → "abcd"
     * stringX("xabxxxcdx") → "xabcdx"
     */

    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
    }

    public static String stringX(String str) {

        if (str.length() < 2) return str;

        String processedStr = "" + str.charAt(0);

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != 'x') {
                processedStr += str.charAt(i);
            }
        }

        return processedStr + str.charAt(str.length() - 1);

    }

}
