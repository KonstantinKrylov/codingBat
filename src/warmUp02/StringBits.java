package warmUp02;

public class StringBits {
    /**
     * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
     * <p>
     * stringBits("Hello") → "Hlo"
     * stringBits("Hi") → "H"
     * stringBits("Heeololeo") → "Hello"
     */

    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));
    }

    public static String stringBits(String str) {
        String resultStr = "";
        for (int i = 0; i < str.length(); i += 2) {
            resultStr += str.charAt(i);
        }
        return resultStr;
    }

}
