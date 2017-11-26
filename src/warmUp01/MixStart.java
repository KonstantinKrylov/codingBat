package warmUp01;

public class MixStart {
    /**
     Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

     mixStart("mix snacks") → true
     mixStart("pix snacks") → true
     mixStart("piz snacks") → false
     */

    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
    }

    public static boolean mixStart(String str) {
        return (str.indexOf("ix") == 1);
    }
}
