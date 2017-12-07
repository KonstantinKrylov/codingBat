package string03;

public class SameEnds {
    /**
     Given a string, return the longest substring that appears at both the beginning and end of the
     string without overlapping. For example, sameEnds("abXab") is "ab".

     sameEnds("abXYab") → "ab"
     sameEnds("xx") → "x"
     sameEnds("xxx") → "x"
     */

    public static void main(String[] args) {
        System.out.println(sameEnds("abXYab"));
    }

    public static String sameEnds(String string) {
        String s1 = string.substring(0,string.length()/2);
        String s2 = string.substring(string.length()/2);
        String longest = "";

        for (int i = 1; i<=s1.length(); i++) {
            if(s2.endsWith(s1.substring(0,i))) longest=s1.substring(0,i);
        }
        return longest;
    }

}
