package string02;

public class RepeatSeparator {
    /**
     * Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
     * separated by the separator string.
     * <p>
     * repeatSeparator("Word", "X", 3) → "WordXWordXWord"
     * repeatSeparator("This", "And", 2) → "ThisAndThis"
     * repeatSeparator("This", "And", 1) → "This"
     */

    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));
    }

    public static String repeatSeparator(String word, String sep, int count) {
        if (count < 1) return "";

        String separated = "";

        for (int i = 0; i < count - 1; i++) {
            separated += word + sep;
        }

        return separated + word;

    }

}
