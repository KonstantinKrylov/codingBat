package string03;

public class CountYZ {
    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in
     * "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
     * We'll say that a y or z is at the end of a word if there is not an alphabetic letter
     * immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * <p>
     * countYZ("fez day") → 2
     * countYZ("day fez") → 2
     * countYZ("day fyyyz") → 2
     */

    public static void main(String[] args) {
        System.out.println(countYZ("y2bz"));
    }

    public static int countYZ(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if (!Character.isLetter(sb.charAt(i))) {
                sb.replace(i, i + 1, " ");
            }
        }

        String[] arr = sb.toString().toLowerCase().split(" ");
        int count = 0;
        for (String word : arr) {
            if (word.endsWith("y") || word.endsWith("z")) count++;
        }
        return count;
    }

}
