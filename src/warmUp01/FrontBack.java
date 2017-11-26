package warmUp01;

public class FrontBack {
    /**
     Given a string, return a new string where the first and last chars have been exchanged.

     frontBack("code") → "eodc"
     frontBack("a") → "a"
     frontBack("ab") → "ba"
     */

    public static void main(String[] args) {
        System.out.println(frontBack("code"));
    }

    public static String frontBack(String str) {
        if (str.length() < 2) return str;
        char theFirst = str.charAt(0);
        char theLast = str.charAt(str.length()-1);
        String theRest = str.substring(1,str.length()-1);
        return theLast + theRest + theFirst;
    }



}
