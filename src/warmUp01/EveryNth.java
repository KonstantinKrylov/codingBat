package warmUp01;

public class EveryNth {
    /**
     Given a non-empty string and an int N, return the string made starting with char 0,
     and then every Nth char of the string.
     So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

     everyNth("Miracle", 2) → "Mrce"
     everyNth("abcdefg", 2) → "aceg"
     everyNth("abcdefg", 3) → "adg"
     */

    public static void main(String[] args) {
        System.out.println(everyNth("Miracle", 2));
    }

    public static String everyNth(String str, int n) {
        String resultStr = str.substring(0,1);

        for(int i = 1; i < str.length(); i++){
            if(i % n == 0) resultStr += str.charAt(i);
        }
        return resultStr;
    }
}
