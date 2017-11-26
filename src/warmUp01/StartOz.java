package warmUp01;

public class StartOz {
    /**
     Given a string, return a string made of the first 2 chars (if present),
     however include first char only if it is 'o' and include the second only if it is 'z',
     so "ozymandias" yields "oz".

     startOz("ozymandias") → "oz"
     startOz("bzoo") → "z"
     startOz("oxx") → "o"
     */

    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
    }

    public static String startOz(String str) {
        if(str.length() >= 2){
            String theFirst = str.substring(0,1);
            String theSecond = str.substring(1,2);
            String theResult = "";

            if(theFirst.equals("o")){
                theResult += theFirst;
            }

            if(theSecond.equals("z")){
                theResult += theSecond;
            }
            return theResult;
        }
        return str;
    }
}
