package string02;

public class RepeatFront {
    /**
     * Given a string and an int n, return a string made of the first n characters of the string,
     * followed by the first n-1 characters of the string, and so on. You may assume that n is between
     * 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
     * <p>
     * repeatFront("Chocolate", 4) → "ChocChoChC"
     * repeatFront("Chocolate", 3) → "ChoChC"
     * repeatFront("Ice Cream", 2) → "IcI"
     */

    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 4));
    }

    public static String repeatFront(String str, int n) {
        String repeated = "";

        for (int i = n; i != 0; i--) {
            repeated += str.substring(0, i);
        }

        return repeated;
    }
}
