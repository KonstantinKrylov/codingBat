package string02;

public class MixString {
    /**
     Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
     the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

     mixString("abc", "xyz") → "axbycz"
     mixString("Hi", "There") → "HTihere"
     mixString("xxxx", "There") → "xTxhxexre"
     */

    public static void main(String[] args) {
        System.out.println(mixString("Hi", "There"));
    }

    public static String mixString(String a, String b) {

        int theEndofMix = a.length();
        String theLongest = b;
        String mixed = "";

        if(theEndofMix > b.length()) {
            theEndofMix = b.length();
            theLongest = a;
        }

        for(int i = 0; i < theEndofMix; i++){
            mixed += "" + a.charAt(i) + b.charAt(i);
        }

        return mixed + theLongest.substring(theEndofMix);
    }
}
