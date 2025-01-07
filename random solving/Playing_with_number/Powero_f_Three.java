package Playing_with_number;
//https://leetcode.com/problems/power-of-three
public class Powero_f_Three {
    public static void main(String[] args) {
        int n=27;
        System.out.println(isPowerOfThree(n));

    }
    public static boolean isPowerOfThree(int n) {
        long pow= (long) Math.pow(3,0);
        int i=0;
        while (pow <= n){
            pow=(long)Math.pow(3,i);
            if (pow==n){
                return true;
            }
           i++;
        }
          return false;
    }
}
