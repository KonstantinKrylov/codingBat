package string02;

public class XyzMiddle {
    /**
     * Given a string, does "xyz" appear in the middle of the string? To define middle,
     * we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
     * This problem is harder than it looks.
     * <p>
     * xyzMiddle("AAxyzBB") → true
     * xyzMiddle("AxyzBB") → true
     * xyzMiddle("AxyzBBB") → false
     */

    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
    }

    public static boolean xyzMiddle(String str) {
        if (str.length() < 3) return false;

        if (str.length() % 2 == 1) {
            int mdl = str.length() / 2;
            if (str.charAt(mdl - 1) == 'x' &&
                    str.charAt(mdl) == 'y' &&
                    str.charAt(mdl + 1) == 'z') return true;
        } else {
            int mdl2 = str.length() / 2;

            if (str.charAt(mdl2 - 1) == 'x' &&
                    str.charAt(mdl2) == 'y' &&
                    str.charAt(mdl2 + 1) == 'z') return true;

            if (str.charAt(mdl2 - 2) == 'x' &&
                    str.charAt(mdl2 - 1) == 'y' &&
                    str.charAt(mdl2) == 'z') return true;
        }
        return false;
    }
}
