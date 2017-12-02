package string02;

public class EndOther {
    /**
     * Given two strings, return true if either of the strings appears at the very end of the other string,
     * ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
     * Note: str.toLowerCase() returns the lowercase version of a string.
     * <p>
     * endOther("Hiabc", "abc") → true
     * endOther("AbC", "HiaBc") → true
     * endOther("abc", "abXabc") → true
     */

    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc"));
    }

    public static boolean endOther(String a, String b) {
        return a.toLowerCase().endsWith(b.toLowerCase()) || b.toLowerCase().endsWith(a.toLowerCase());
    }
}
