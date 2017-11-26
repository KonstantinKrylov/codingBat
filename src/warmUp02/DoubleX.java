package warmUp02;

public class DoubleX {
    /**
     Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

     doubleX("axxbb") → true
     doubleX("axaxax") → false
     doubleX("xxxxx") → true
     */

    public static void main(String[] args) {
        System.out.println(doubleX("wfwfx"));
    }

    public static boolean doubleX(String str) {
        if(str.length() < 2) return false;
        if(str.indexOf("x") + 1 == str.length()) return false;
        return (str.charAt(str.indexOf("x") + 1) == 'x');
    }

}
