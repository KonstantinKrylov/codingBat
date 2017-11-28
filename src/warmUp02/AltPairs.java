package warmUp02;

public class AltPairs {
    /**
     * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
     * <p>
     * altPairs("kitten") → "kien"
     * altPairs("Chocolate") → "Chole"
     * altPairs("CodingHorror") → "Congrr"
     */

    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
    }

    public static String altPairs(String str) {

        if (str.length() < 2) return str;

        String processedStr = str.substring(0, 2);

        for (int i = 4, j = 3; i < str.length(); i += j) {
            processedStr += str.charAt(i);
            if (j == 1) {
                j = 3;
            } else {
                j = 1;
            }
        }

        return processedStr;
    }

}
