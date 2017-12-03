package string02;

public class PlusOut {
    /**
     * Given a string and a non-empty word string, return a version of the original String where
     * all chars have been replaced by pluses ("+"), except for appearances of the word string
     * which are preserved unchanged.
     * <p>
     * plusOut("12xy34", "xy") → "++xy++"
     * plusOut("12xy34", "1") → "1+++++"
     * plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
     */

    public static void main(String[] args) {
        System.out.println(plusOut("12xy34xyabcxy", "xy"));
    }

    public static String plusOut(String str, String word) {
        StringBuilder sb = new StringBuilder(str);
        int indx = word.length();

        for(int i=0; i<sb.length(); i++){
            if(i+indx <= sb.length()){
                if(sb.substring(i,i+indx).equals(word)){
                    i += indx-1;
                }else{
                    sb.replace(i,i+1,"+");
                }
            }else{
                sb.replace(i,i+1,"+");
            }
        }
        return sb.toString();
    }
}
