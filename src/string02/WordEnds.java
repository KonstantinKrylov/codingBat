package string02;

public class WordEnds {
    /**
     * Given a string and a non-empty word string, return a string made of each char just before
     * and just after every appearance of the word in the string. Ignore cases where there is no char
     * before or after the word, and a char may be included twice if it is between two words.
     * <p>
     * wordEnds("abcXY123XYijk", "XY") → "c13i"
     * wordEnds("XY123XY", "XY") → "13"
     * wordEnds("XY1XY", "XY") → "11"
     */

    public static void main(String[] args) {
        System.out.println(wordEnds("33", "XY"));
    }

    public static String wordEnds(String str, String word) {
        if (str.length() == word.length()) return "";
        StringBuilder result = new StringBuilder();
        int indx = 0;
        int previous = 0;
        int wordLn = word.length();

        for (int i = 0; i < str.length(); i++) {

            indx = str.indexOf(word, previous);
            previous = indx + wordLn;

            if (indx == 0) {
                result.append(str.charAt(wordLn));
                i += indx;
                continue;
            }

            if (indx == str.length() - wordLn) {
                result.append(str.charAt(indx - 1));
                break;
            }
            result.append(str.charAt(indx - 1));
            result.append(str.charAt(indx + wordLn));

            if (indx == str.lastIndexOf(word)) break;
        }
        return result.toString();
    }
}
