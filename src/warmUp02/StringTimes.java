package warmUp02;

public class StringTimes {
    /**
     * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
     * <p>
     * stringTimes("Hi", 2) → "HiHi"
     * stringTimes("Hi", 3) → "HiHiHi"
     * stringTimes("Hi", 1) → "Hi"
     */

    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));
    }

    public static String stringTimes(String str, int n) {
        String part = "";

        while (n != 0) {
            part += str;
            n--;
        }

        return part;
    }
}
