package string03;

public class SumNumbers {
    /**
     * Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
     * A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char
     * is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
     * <p>
     * sumNumbers("abc123xyz") → 123
     * sumNumbers("aa11b33") → 44
     * sumNumbers("7 11") → 18
     */

    public static void main(String[] args) {
        System.out.println(sumNumbers("7 11"));
    }

    public static int sumNumbers(String str) {
        String[] arr = str.split("\\D");
        int sum = 0;
        for (String word : arr) {
            if (word.length() != 0) sum += Integer.parseInt(word);
        }
        return sum;
    }

}
