package string03;

public class GHappy {
    /**
     We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its
     left or right. Return true if all the g's in the given string are happy.

     gHappy("xxggxx") → true
     gHappy("xxgxx") → false
     gHappy("xxggyygxx") → false
     */

    public static void main(String[] args) {
        System.out.println(gHappy("xxggxx"));
    }

    public static boolean gHappy(String str) {
        if(str.equals("g")) return false;
        String[] arr = str.split("gg");

        for(String word:arr){
            if(word.indexOf("g",1)!=-1) return false;
        }
        return true;
    }

}
