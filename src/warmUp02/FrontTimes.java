package warmUp02;

public class FrontTimes {
    /**
     * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
     * or whatever is there if the string is less than length 3. Return n copies of the front;
     * <p>
     * frontTimes("Chocolate", 2) → "ChoCho"
     * frontTimes("Chocolate", 3) → "ChoChoCho"
     * frontTimes("Abc", 3) → "AbcAbcAbc"
     */

    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
    }

    public static String frontTimes(String str, int n) {

        String resultS = "";

        if (str.length() < 3) {
            str = str;
        } else {
            str = str.substring(0, 3);
        }

        while (n != 0) {
            resultS += str;
            n--;
        }
        return resultS;
    }
}
