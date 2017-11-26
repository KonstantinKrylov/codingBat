package warmUp01;

public class DelDel {
    /**
     Given a string, if the string "del" appears starting at index 1,
     return a string where that "del" has been deleted.
     Otherwise, return the string unchanged.

     delDel("adelbc") → "abc"
     delDel("adelHello") → "aHello"
     delDel("adedbc") → "adedbc"
     */

    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));
    }

    public static String delDel(String str) {
        if (str.indexOf("del") == 1){
            String beforeF = str.substring(0, 1);
            String afterF = str.substring(4, str.length());
            return beforeF + afterF;
        }
        return str;
    }
}
