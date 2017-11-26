package warmUp01;

public class IntMax {
    /**
     Given three int values, a b c, return the largest.

     intMax(1, 2, 3) → 3
     intMax(1, 3, 2) → 3
     intMax(3, 2, 1) → 3
     */

    public static void main(String[] args) {
        System.out.println(intMax(1, 2, 3));
    }

    public static int intMax(int a, int b, int c) {
        int[] arr = {a,b,c};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
