package warmUp01;

public class Close10 {
    /**
     Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
     Note that Math.abs(n) returns the absolute value of a number.

     close10(8, 13) → 8
     close10(13, 8) → 8
     close10(13, 7) → 0
     */

    public static void main(String[] args) {
        System.out.println(close10(8, 13));
    }

    public static int close10(int a, int b) {
        int aAbs = Math.abs(a-10);
        int bAbs = Math.abs(b-10);
        if(aAbs == bAbs){
            return 0;
        }
        if (aAbs > bAbs){
            return b;
        } else {
            return a;
        }
    }
}
